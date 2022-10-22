public class Task_3 implements Task_3_base {
    /* (non-Javadoc)
     * @see Task_3_base#subtask_1_for(int, int, int, int)
     */
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        int chislo = 0;
        if (n1<n2) {
            for(; n1 <= n2; n1++){
                if(n1 % a == 0 && n1 % b !=0)
                    chislo++;
            }
        }
        else {
            for (; n2 <= n1; n2++) {
                if ((n2 % a == 0) && (n2 % b != 0)) {
                    chislo++;
                }
            }
        }
        return chislo;
    }


    @Override
    public int subtask_2_for(int num) {
        int p = 0;
        int num2 = 1;
        for (int i = 0; i <= num; i++) {
            p++;
            for (int j = 0; j < num2; j++) {
                i++;
            }
            num2++;
        }
        return p;
    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        int a = num;
        int summ = 0;
        for (int i = 0; i < cnt; i++){
            summ = summ + a;
            a = a*d + 1;
        }
        return summ;
    }

    @Override
    public int subtask_4_for(int n) {
        int fact = 1;
        int summ = 0;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
            summ = summ + fact;
        }
        return summ;
    }
}