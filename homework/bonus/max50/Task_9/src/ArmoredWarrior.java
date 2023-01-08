public class ArmoredWarrior extends Warrior {
    private int armor;


    public ArmoredWarrior(String name, int attack , int health , int armor){
        super(name,attack,health);
        this.armor=armor;

    }
    public int getArmor() {return this.armor;}

    @Override
    public void TakeDamage(Warrior currWarrior){
        int currHealth;
        currHealth=currWarrior.getHealth()-this.armor;
        if(currHealth <= 1){
            currHealth = 1;
        }
        currWarrior.setHealth(currHealth);
    }
}

