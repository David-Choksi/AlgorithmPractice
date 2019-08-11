public class binarySearch1 {

    public static Boolean binarySearch(int[] arr, int n){
        

        // This is O(n) complexity and O(1) space. 
        
        if (arr.length < 1 || arr == null) {
            return false;
        }  
        
        int low = 0;
        int high = arr.length - 1;
        int mid;
        
        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == n) {
                return true;
                
            } else {
                if (n < arr[mid]) {
                    high = mid - 1;
                    
                } else {
                    low = mid + 1;
                }
            }
        }
        
        return false;
    }
}