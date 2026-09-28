package Javachallenge100days.Day01;

/**
 * Problem04
 */
public class Problem04 {
    public static void main(String[] args){
        // calculate sum and average of an array
        // brute-force solution
        int[] arr = {10,20,30};
        double average = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of an array is: " + sum);

        average = (double) sum / arr.length;
        System.out.println("average of an array is: " + average);
    }  
}


// time complexity O(N)
// space complexity O(1)