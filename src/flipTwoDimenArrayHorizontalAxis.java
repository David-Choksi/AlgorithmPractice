public class flipTwoDimenArrayHorizontalAxis {
    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    public static void flipHorizontalAxis(int[][] matrix) {
        
        // Flipping across Horizontal axis, in place.
        // Need 2 pointers, 1 for top array of matrix, another for bottom. 
        // Need index values for beginning and ending arrays in the matrix. Can get inner arrays from this index.

        int startIndex = 0;
        int endIndex = matrix.length - 1;
        
        int[] start = matrix[startIndex];
        int[] end = matrix[endIndex];
        int[] temp = matrix[startIndex];
        
        while (endIndex > startIndex) {

            // Do the swaps like normal, except we're swapping actual arrays here.
            // Need deep copy, so Arrays.copyOf to make a deepy copy. 
            temp = Arrays.copyOf(matrix[startIndex], matrix[startIndex].length);
            start = Arrays.copyOf(matrix[endIndex], matrix[endIndex].length);
            end = temp;
            
            // Update original matrix with swapped arrays.
            matrix[startIndex] = start;
            matrix[endIndex] = end;
            
            // Update indexes of arrays. 
            startIndex++;
            endIndex--;
        }
        
        // if (matrix.length > 1) {
        //     for(int i = 0; i < matrix.length / 2; i++) {
        //         int[] temp = matrix[i];
        //         matrix[i] = matrix[matrix.length - 1 - i];
        //         matrix[matrix.length - 1 - i] = temp;
        //     }
        // }
    }
}