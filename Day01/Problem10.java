package Javachallenge100days.Day01;

/**
 * Problem10
 */
public class Problem10 {

    public static void main(String[] args) {
        // sum of digits
        // bruteforce approach
        int num = 12345;
        int res = 0;

        while(num != 0){
            int extract = num % 10;
            res = res + extract;
            num = num / 10;
        }
        System.out.println(res);
    }
}

// time complexity: O(logN);
// space complexity: O(1);