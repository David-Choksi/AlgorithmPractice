import java.util.Arrays;

public class BinarySearchImplementation {

    public static Boolean binarySearch2(int[] arr, int n){

        int low, mid, high;

        if (arr == null || arr.length < 1){
            return false;
        }

        low = 0;
        high = arr.length - 1;
        mid = arr.length / 2;

        while(low <= high){

            //if you find n
            if (arr[mid] == n){
                return true;
            }else {

                //if n is less; look to left half
                if (n < arr[mid]){

                    //low stays same, new high is old mid, find new mid
                    high = mid;
                    mid = (int) Math.floor((high + low) / 2);

                }else{ //if n is more; look to right half

                    //high stays same, new low is old mid, find new mid
                    low = mid + 1;
                    mid = (int) Math.floor((high + low) / 2);

                }

            }
        }

        return false;
    }

    public static Boolean binarySearch(int[] arr, int n){

        if (arr.length < 1 || arr == null) {
            return false;
        }

        int mid = arr.length / 2;
        int start = 0;
        int end = (arr.length - 1);
        int length = arr.length;

        if (mid == end) {
            return (arr[start] == n || arr[end] == n);
        }

        else if (arr[mid] == n) {
            return true;
        }

        else if (n > arr[mid]) {
            int[] higher = Arrays.copyOfRange(arr, mid + 1, end);
            return binarySearch(higher, n);
        }

        else if (n < arr[mid]) {
            int[] lower = Arrays.copyOfRange(arr, start, mid - 1);
            return binarySearch(lower, n);
        }

        else {
            return false;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 5, 7, 9, 12};
        int[] arr3 = {2};
        int[] arr4 = {};

        System.out.println(binarySearch2(arr1, 1));
        System.out.println(binarySearch2(arr2, 12));
        System.out.println(binarySearch2(arr3, 4));
        System.out.println(binarySearch2(arr4, 2));

    }



}
