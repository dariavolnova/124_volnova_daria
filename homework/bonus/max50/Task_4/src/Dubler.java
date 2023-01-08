public class Dubler {
    public static int[] doubling( int[] arr){
        int[] massive2 = new int[arr.length*2];
        int count = 0;
        for (int i : arr)
            massive2[count++]=massive2[count++]=i;
        return massive2;
    }
}
