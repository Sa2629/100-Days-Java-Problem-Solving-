package Javachallenge100days.Day01;

/**
 * Problem08
 */
public class Problem08 {

    public static void main(String[] args) {
        // check prime number
        // brute-force approach
        int num = 30;
        boolean prime = true;

        if(num < 2){
            prime = false;
        }
        else{
            for(int i = 2; i < num; i++){
                if(num % i ==0 ){
                    prime = false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println("prime");
        }
        else{
            System.out.println("not-prime");
        }
    }
}


// time complexity: O(N);
// space complexity: O(1);