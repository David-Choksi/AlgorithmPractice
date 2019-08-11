public class FibonnaciImplementation {

    //this is the easiest but most naive implementation - time complexity exponential
    private static int fib1(int n){

        if (n <= 1){
            return n;
        }

        return fib1(n - 1) + fib1(n - 2);

    }

    //This is the iterative implementation -- time complexity linear O(n)
    //Space complexity O(n) -- previous values are stored in array
    private static int fib2(int n){

        if (n <= 1){
            return n;
        }

        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    //This is iterative -- time complexity O(n)
    //Space complexity O(1)
    private static int fib3(int n){

        if (n <= 1){
            return n;
        }

        int a = 0;
        int b = 1;
        int total = 0;

        for (int i = 2; i <= n; i++){
            total = a + b;
            a = b;
            b = total;

        }

        return total;

    }

    public static void main(String[] args) {


        long startTime = System.nanoTime();
        System.out.println(fib1(20));
        long endTime = System.nanoTime();
        System.out.println("fib1: That took " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        System.out.println(fib2(20));
        endTime = System.nanoTime();
        System.out.println("fib1: That took " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        System.out.println(fib3(20));
        endTime = System.nanoTime();
        System.out.println("fib1: That took " + (endTime - startTime) + " nanoseconds");
    }
}
