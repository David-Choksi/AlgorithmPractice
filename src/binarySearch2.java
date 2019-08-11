public class binarySearch2 {

    public static Boolean binarySearch(int[] arr, int n){
        
        // This is the Recursive Approach, also O(n) and O(1) space.
        if (arr.length < 1 || arr == null) {
            return false;
        }  
    
        return binaryHelper(arr, n, 0, (arr.length - 1));
    }

    public static Boolean binaryHelper(int[] arr, int n, int start, int end) {
    
        int mid = (start + end)/2;    
    
        if (mid == end) {
            return (arr[start] == n || arr[end] == n); 
        }
        
        else if (arr[mid] == n) {
            return true;
        }
        
        else if (n > arr[mid]) {

            // The way Arrays.copyOfRange works, is makes subarray from start, to end EXCLUSIVE, so need end + 1 to include the end element.

            // int[] higher = Arrays.copyOfRange(arr, mid + 1, end + 1);
            return binaryHelper(arr, n, mid + 1, end + 1);
        }

        else if (n < arr[mid]) {
            // int[] lower = Arrays.copyOfRange(arr, start, mid);
            return binaryHelper(arr, n, start, mid);
        }
        
        else {
            return false;
        }
    }
}