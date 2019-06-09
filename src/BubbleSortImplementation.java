public class BubbleSortImplementation {

    public static int[] bubbleSortArray(int[] arr){
    
        // Check Null first because arr.length won't work on null objects.
        // If the array is 1 element (i.e. it's sorted), or no elements, then just return it.
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        
        // Initialize pointers.
        int left, right, temp; 
        
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                left = arr[j];
                right = arr[j + 1];
                
                if (left > right) {
                    temp = left;
                    arr[j] = right;
                    arr[j+1] = temp;
                }
            }
        }
    
        
        return arr;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}
