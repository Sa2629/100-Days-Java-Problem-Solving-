package Javachallenge100days.Day01;

/**
 * Problem02
 */
public class Problem02 {

    public static void main(String[] args) {
        // Find the largest and smallest element in an array.
        // brute-force approach
        int[] arr = {12,34,56,39,87,90};
        int highest = arr[0];
        int lowest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > highest){
                highest = arr[i];
            }
            if(arr[i] < lowest){
                lowest = arr[i];
            }
        }
        System.out.println("the highest value in the array is: " + highest);
        System.out.println("the lowest value in the array is: " + lowest);

        // time complexity: O(N)
        // space complexity: O(1)
    }
}