import java.util.*;
import java.util.streams.*;

public class flipTwoDimenArray {
    public static void flipItVerticalAxis(int[][] matrix) {
        for (int[] row : matrix) {   
            int left = 0;
            int right = row.length - 1;
            int temp;
            
            while (left < right) {
                temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }
    /* Rule of thumb:
        Iterating through matrix rows = use matrix.length
        Iterating through matrix columns = use matrix[0].length
    */
    }
}