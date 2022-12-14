package TwoDArrays;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int n = matrix.length, m = matrix[0].length;
        int startRow = 0, endRow = n-1, startCol = 0, endCol = m-1;

        while(startRow <= endRow && startCol <= endCol) {
            //print top
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //print right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }
            //print bottom
            if(startRow == endRow) {
                break; //because it already print as top.
            }
            for(int j=endCol-1; j>=startCol; j--) {
                System.out.print(matrix[endRow][j]+" ");
            }
            //print left
            if(startCol == endCol) {
                break;//if it already print as right
            }
            for(int i=endRow-1; i>=startRow+1; i--) {
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String args[]) {
    int matrix[][] = {{1, 2, 3, 4}, 
                      {5, 6, 7, 8}, 
                      {9, 10, 11, 12}, 
                      {13, 14, 15, 16}};
    printSpiral(matrix);
    }
}
