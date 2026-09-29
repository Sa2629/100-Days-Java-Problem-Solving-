package Javachallenge100days.Day01;

/**
 * Problem09
 */
public class Problem09 {

    public static void main(String[] args) {
        // check armstrong number
        // brute-force approach
        int num = 153;
        int original = num;
        int temp = num;
        int count = 0;

        if(temp == 0){
            count = 1;
        }
        else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }
        temp = num;
        long sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            long power = 1;
            for(int i = 1; i <= count; i++){
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if(sum == original){
            System.out.println("Arm strong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}