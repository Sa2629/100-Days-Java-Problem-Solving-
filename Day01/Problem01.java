package Javachallenge100days.Day01;

public class Problem01 {
    public static void main(String[] args) {
        // find count of even odd from an array
        // bruteforce approach will update later to an optimized way
        int[] arr = {12,200,39,1,3,9,56};
        int even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even numbers are: " + even);
        System.out.println("odd numbers are: " + odd);
    }
}

// time complexity = O(N)
// space complexity = O(1)
