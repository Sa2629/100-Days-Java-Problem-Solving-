package Javachallenge100days.Day01;

/**
 * Problem07
 */
public class Problem07 {

    public static void main(String[] args) {
        // check palindrome number
        // bruteforce solution/approach
        int num = 12213;
        int original = num;
        long reverse = 0;

        while(num != 0){
            int extract = num % 10;
            reverse = reverse * 10 + extract;
            num = num / 10;
        }

        if(original == reverse){
            System.out.println(original + " is a palindrome");
        }
        else{
            System.out.println(original + " is not a palindrome");
        }
    }
}



// time complexity: O(logN)
// space complexity: O(1)