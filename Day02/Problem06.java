package Javachallenge100days.Day02;

/**
 * Problem06
 */
public class Problem06 {

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        // print the fibonacci series upto n terms
        int k = 10;
        
        for(int i = 0; i < k; i++){
            System.out.println("the fibonnaci series upto " + k + " are:" + fibonacci(i) + " ");
        }
    }
}