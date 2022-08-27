package TwoDArrays;
import java.util.*;
public class Creation {
    /**
     * @param args
     */
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = 3;//matrix.length;//No. of rows
        int m = 3;//matrix[0].length; //No. of column
        Scanner sc = new Scanner(System.in);

        //Taking input for 2D array
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        //Print 2D array after taking input
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}
