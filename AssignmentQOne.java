package TwoDArrays;

public class AssignmentQOne {
    public static int countNumber(int matrix[][], int key) {
        int count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]) {
        /*
         * Print the number of 7’s that are inthe 2d array.
         */
        int matrix[][] = {{4, 7, 8}, {8, 8, 7}};
        int key = 8;
        System.out.println("Key found "+countNumber(matrix, key)+" times.");
    }
}
