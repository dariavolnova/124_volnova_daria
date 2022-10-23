import java.util.Arrays;

public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        int[] bobr = new int[size];
        bobr[0] = a0;
        int i = 1;
        while (i != size) {
            bobr[i] = bobr[i - 1] + d;
            i++;

        }
        return bobr;
    }


    @Override
    public int[] subtask_2_arrays(int size) {
        int cac[] = new int[size];
        int c = 2;
        for (int i = 0; i < size; i++) {
            if (i < 2) {
                cac[i] = 1;
            } else {
                cac[i] = cac[i-1] * 2;
            }
        }
        return cac;
    }


    @Override
    public int[] subtask_3_arrays(int size) {
        int a[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            if (i==0) {
                a[i] = 0;
            }
            else {
                if (i==1){
                    a[i] = 1;
                }
                else {
                    a[i]=a[i-1]+a[i-2];
                }
            }
        }
        return a;
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        int max_num = Integer.MIN_VALUE;;
        for(int i = 0; i < data.length; i++) {
            if (data[i] > max_num){
                max_num = data[i];
            }
        }
        return max_num;
    }




    @Override
    public int subtask_5_arrays(int[] data, int k) {
        int max_num = Integer.MIN_VALUE;;
        for(int i = 0; i < data.length; i++) {
            if ((data[i] > max_num) && (data[i] % k == 0)){
                max_num = data[i];
            }
        }
        return max_num;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {

        int arr3[] = new int[arr1.length + arr2.length];
        int size1 = arr1.length;
        int size2 = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < size1 && j < size2){
            if (arr1[i] <= arr2[j]){
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k]= arr2[j];
                j++;
            }
            k++;
        }
        while (i < size1){
            arr3[k]= arr1[i];
            i++;
            k++;
        }
        while (j < size2){
            arr3[k]= arr2[j];
            j++;
            k++;
        }
        Arrays.sort(arr3);
        return arr3;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}
