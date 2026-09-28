package Javachallenge100days.Day01;

import java.util.Arrays;
/**
 * Problem03
 */
public class Problem03 {

    public static void main(String[] args) {
        // reverse of an array (in-place)
        int[] arr = {10,20,30,40,50};
        int[] reverse = new int[arr.length];
        
        int j = 0; // index tracker for new array

        for(int i = arr.length -1; i >= 0; i--){
            reverse[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(reverse));
    }
}