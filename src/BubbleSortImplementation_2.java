public class BubbleSortImplementation_2 {

    public static int[] bubbleSort(int[] arr){
        if (arr == null) {
            return null;
        }

            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr.length-1-i; j++){

                    if (arr[j] > arr[j+1]){
                        int temp;
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }

                }
            }

        return arr;
        }
}
