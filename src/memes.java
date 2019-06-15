import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class memes {
        /*
         * Complete the 'minMoves' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY avg as parameter.
         */

        public static int minMoves(List<Integer> avg) {
            // Can do this in O(n) time. For every 1 seen in the array, add the number of 0s to the right of that 1 to a count.
            // That count is the minimum number of swaps.

            Integer list[] = new Integer[avg.size()];
            Integer list2[] = new Integer[avg.size()];
            list = avg.toArray(list);
            list2 = avg.toArray(list);
            int numOfZeroes = 0;
            int numOfZeroes2 = 0;

            for (int i = 0; i < list.length; i++){
                if (list[i] == 0){
                    continue;
                } else{
                    for (int j = i; j < list.length; j++){
                        if (list[j] == 0){
                            numOfZeroes++;
                        }
                    }
                }
            }

            for (int i = list.length - 1; i >= 0; i--){
                if (list[i] == 0){
                    continue;
                } else{
                    for (int j = i; j >= 0; j--){
                        if (list[j] == 0){
                            numOfZeroes2++;
                        }
                    }
                }
            }

            if (numOfZeroes < numOfZeroes2){
                return numOfZeroes;
            }else {
                return numOfZeroes2;
            }


            //int swapCount = 0;



        /*
        // First need an array to store count of 0s. It's size will be same as the input array.
        int zeroCount[] = new int[list.length];

        // Set the last element of the zeroCount array; it's content is set based on whether last element of input array is a 1, which if it is, means there's no more 0s to the right
        // of the 1, since it's the last element. So set the zeroCount in the last position to be 0, or a 1 otherwise.

        zeroCount[list.length - 1] = 1 - list[list.length - 1];

        // Loop through remainder of input list backwards starting from 2nd last element.
        for (int i = list.length - 2; i >= 0; i--) {
            // Initialize the zeroCount element at the indicated position to be equal to the one right AFTER it.
            zeroCount[i] = zeroCount[i + 1];

            // Check input array at the i'th position, if it's a 0, it means that's an additional swap for every 1 to the left of it. Increment the zeroCount array at the i'th
            // position, which corresponds to the input array, to be incremented by 1.
            if (list[i] == 0) {
                zeroCount[i]++;
            }
        }

        // Now loop through the zeroCount array, and add all the numbers together, where the corresponding zeroCount array element index in the input array is a 1.
        // i.e. Total swaps are calculated by adding 0s to the right of every one.
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 1) {
                swapCount += zeroCount[i];
            }
        }

        return swapCount;*/
            // int currentSwaps = 0;
            // int swapCount = 0;

            // for (int i = avg.size() - 1; i >= 0; i--) {
            //     if (avg.get(i) == 0) {
            //         currentSwaps++;
            //     }

            //     else {
            //         swapCount += currentSwaps;
            //     }
            // }

            // return swapCount;



        }

    public static void main(String[] args) {

    }
}
