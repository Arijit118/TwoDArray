package TwoDArrays;

public class DiagonalSum {
    public static int printDiagonalSum(int matrix[][]) {
        int sum = 0;
        //Brute force approach
        /* 
        ## Time Complexity = O(n2) 
        for(int i=0; i<matrix.length; i++) {
            //Calculate primary diagonal sum where i=j
            for(int j=0; j<matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
                //Calculate secondary diagonal sum where i+j=n-1
                else if(i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        */
        //More optimized approach ## Time Complexity = O(n).
        for(int i=0; i<matrix.length; i++) {
            //Primary diagonal
            sum += matrix[i][i];
            //Secondary diagonal
            if(i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Diagonal sum = "+printDiagonalSum(matrix));
    }
}
