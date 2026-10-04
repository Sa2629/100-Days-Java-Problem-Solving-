package Javachallenge100days.Day02;

/**
 * Problem05
 */
public class Problem05 {
    // find and print sum of fibonacci series
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // find and print the sum of the fibonacci series upto n terms
        // bruteforce approach

        int n = 10;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}

// time complexity: O(2N)
// spcae complexity: O(N)