package TwoDArrays;

public class AssignmentQTwo {
    public static void main(String args[]) {
        /*
         * Print out the sum of the numbers in the second row of the “nums” array.
         *  int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
         */
        int nums[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = 0;
        for(int col=0; col<nums[0].length; col++) {
            sum += nums[1][col];
        }
        System.out.println("Total sum of second row = "+sum);
    }
}
