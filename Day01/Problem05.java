package Javachallenge100days.Day01;

class Problem05 {
    public static void main(String[] args) {
        // two sum 
        // brute-force solution

        int[] arr = {10,90,23,34,55,29};
        int target = 84;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("the indicies of an array is: " + i + ", " + j);
                    System.out.println("the values are: " + arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}

// time complexity: O(N²)
// space complexity: O(1)