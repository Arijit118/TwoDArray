package TwoDArrays;
import java.util.*;
public class SearchNumInMatrix {
    public static boolean search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Key found at cell ("+i+", "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        //Taking input
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //Print matrix
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 10);
    } 
}
