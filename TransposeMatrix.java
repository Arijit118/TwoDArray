package TwoDArrays;

public class TransposeMatrix {
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};

        int row = matrix.length, col = matrix[0].length; //Here row=2, col=3;
        //Print Original matrix
        printMatrix(matrix);

        //Transpose the matrix
        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        //Print transpose matrix
        printMatrix(transpose);
    }
    public static void printMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
