import java.util.Arrays;

public class FlipItHorizontal {

    public static void flipHorizontalAxis(int[][] matrix){

        //swap the whole arrays held within the matrix
        //require two ptrs starting from top and bottom of matrix
        //need to cache ptrIndex as well - you can get the arrays from the matrix index
        //but not the other way around.

        int beginIndex = 0;
        int endIndex = (matrix.length - 1);
        int[] begin = matrix[beginIndex];
        int[] end = matrix[endIndex];
        int[] temp;


        while(endIndex > beginIndex){
            //swap the arrays with a temp variable
            temp = Arrays.copyOf(begin, begin.length);
            begin = Arrays.copyOf(end, end.length);
            end = Arrays.copyOf(temp, temp.length);

            //update the new arrays in the matrix
            matrix[beginIndex] = begin;
            matrix[endIndex] = end;

            //update the new indexes
            beginIndex++;
            endIndex--;

            //move begin and end to the next set to be swapped
            begin = matrix[beginIndex];
            end = matrix[endIndex];
        }

    }



    public static void main(String[] args) {
        int[][] matrix1 = {{1,0,0}, {0,0,1}};
        int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix3 = {{1,0}};

        FlipIt.toStringMatrix(matrix1);
        FlipIt.toStringMatrix(matrix2);
        FlipIt.toStringMatrix(matrix3);

        System.out.println("------------------FLIPPING---------------------");

        flipHorizontalAxis(matrix1);
        flipHorizontalAxis(matrix2);
        flipHorizontalAxis(matrix3);

        FlipIt.toStringMatrix(matrix1);
        FlipIt.toStringMatrix(matrix2);
        FlipIt.toStringMatrix(matrix3);
    }
}

