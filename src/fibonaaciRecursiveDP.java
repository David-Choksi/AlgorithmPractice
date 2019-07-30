import java.util.*;
import java.util.streams.*;

public class fibonacciRecursiveDP {

    /* 
    This is a Recursive Dynamic Programming / Memoization way of doing Fibonacci.
    
    The calculation for any number is done only once and stored in an array. If that same number needs to be calculated again,
    it's first checked in the array and returned. Should a value not exist in the array for "n", then a calculation is done. 

    */

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int[] storage = new int[n + 1];
        
        storage[0] = 0;
        storage[1] = 1;
        
        if (storage[n - 1] != 0 && storage[n - 2] != 0) {
            return storage[n - 1] + storage[n - 2];
        }
        
        return fibHelper(n, storage);
    }

    public static int fibHelper(int n, int[] storage) {
        if (n <= 1) {
            return n;
        }
        
        if (storage[n - 1] != 0 && storage[n - 2] != 0) {
            return storage[n - 1] + storage[n - 2];
        }
        
        storage[n] = fibHelper(n - 1, storage) + fibHelper(n - 2, storage);
        return storage[n];
    }
}