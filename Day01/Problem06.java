package Javachallenge100days.Day01;

/**
 * Problem06
 */
public class Problem06 {

    public static void main(String[] args){
        // reverse a number
        // brute-force approach
        int num = 12345;
        int reversed = 0;

        while (num!=0) {
            int extract = num % 10;
            reversed = reversed * 10 + extract;
            num /= 10;
        }
        System.out.println(reversed);
    }
}

// time complexity: O(logN)
// space complexity: O(1)