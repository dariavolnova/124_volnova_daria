import telebot
import config
import requests
from bs4 import BeautifulSoup
import datetime

bot = telebot.TeleBot(config.TOKEN)

@bot.message_handler(commands=['start'])
def send_welcome(message):
    user_name = message.from_user.first_name
    bot.reply_to(message, "Привет, я назову тебе известных людей, родившихся в загаданный день!"
                          " Для поиска, пришли мне сообщение в формате 'dd.mm.yyyy'.")

@bot.message_handler(func=lambda message: True)
def send_birth_info(message):
    try:
        birth_date = datetime.datetime.strptime(message.text, '%d.%m.%Y').strftime('%B %d')
        url = f"https://www.onthisday.com/birthdays/date/{birth_date}"
        page = requests.get(url)
        soup = BeautifulSoup(page.content, 'html.parser')

        names_list = soup.find_all('span', {'class': 'title'})
        names = [name.text.strip() for name in names_list]

        if len(names) > 0:
            reply_text = f"Известные люди, родившиеся {birth_date}:"
            for name in names:
                reply_text += f"\n{name}"
            bot.reply_to(message, reply_text)
        else:
            bot.reply_to(message, "К сожалению, я не нашел ни одного известного человека с такой датой рождения :(.")
    except ValueError:
        bot.reply_to(message, "Отправьте дату рождения в формате 'dd.mm.yyyy'.")


bot.polling()