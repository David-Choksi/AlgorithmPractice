public class BubbleSortImpSecond {
        // java.util.* and java.util.streams.* have been imported for this problem.
        // You don't need any other imports.

    public static int[] bubbleSortArray(int[] arr){
        
        if (arr == null || arr.length < 2) {
            return arr;
        }
        
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        
        return arr;
    }
}