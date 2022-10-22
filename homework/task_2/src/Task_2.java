public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        int a = 0;
        int b = 0;
        while (a <= num) {
            if (a * a <= num) {
                b = a * a;
            }
            a++;
        }
        return b;
    }


    @Override
    public int subtask_2_while(int num) {
        int p = 1;
        if (num == 0) {
            p = 1;
        }
        if (num > 0) {
            while (num != 0) {
                p = 2 * p + 6;
                num--;
            }
        }
        return p;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        int i = base;
        while (i<num) {
            i = i * base;
        }
        return i == num;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        int kolvo=0;
        while (start > end){
            if ((start % 2 != 0) || (start - end <= 2)){
                start--;
                kolvo++;
            }
            else {
                start /= 2;
                kolvo++;
            }
        }
        return kolvo;
    }
}