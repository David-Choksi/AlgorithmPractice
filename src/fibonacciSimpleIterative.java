import java.util.*;
import java.util.streams.*;

public class fibonacciSimpleIterative {
    
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int secondNumber = 0, firstNumber = 1, currentNumber;
        
        for (int i = 2; i <= n; i++) {
            currentNumber = secondNumber + firstNumber;
            secondNumber = firstNumber;
            firstNumber = currentNumber;
        }
        
        return currentNumber;
    }
}