package Arrays2;

import java.util.Arrays;
import java.util.List;


public class Main {


    public static int countEvens(int nums[]) {
        
        return (int) Arrays.stream(nums)
        .filter(n -> n % 2 == 0)
        .count();
        
    }


    public static int sum13(int[] nums) {

        int sum = 0;
        boolean skipNext = false;

        for (int i = 0; i < nums.length; i++) {
            if (skipNext) {
                skipNext = false;
                continue;
            }

            if (nums[i] == 13) {
                skipNext = true;
            } else {
                sum += nums[i];
            }
        }

        return sum;
  
    }

    // 3
    public static boolean lucky13(int[] nums) {
        //return true if a nums DOES NOT HAVE 1 AND 3

        boolean contains1 = false;
        boolean contains3 = false;
        
        for (int num: nums) {
          if (num == 1) 
            contains1 = true;
            
          else if (num == 3)
            contains3 = true;
        }
      
        return !contains1 && !contains3;
        
    }


    // 4
    public static int[] fizzArray(int n) {

        int[] result = new int[n];

        if (n == 0) return result;

        for (int i = 0; i < n; i++) {
            result[i] = i;
        }

        return result;
  
    }

    // 5
    public boolean no14(int[] nums) {

        boolean containsOne = false;
        boolean containsFour = false;
    
        for (int number : nums) {
            if (number == 1) {
                containsOne = true;
            } else if (number == 4) {
                containsFour = true;
            }
        }
    
        return !containsOne || !containsFour; 
    }


    //6

    //7 
    public boolean modThree(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            boolean areConsecutiveEven = nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0;
            boolean areConsecutiveOdd = nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0;
    
            if (areConsecutiveEven || areConsecutiveOdd) {
                return true;
            }
        }
    
        return false;
    }
    
    















      // 2nd column
      // 4
      public static boolean only14(int[] nums) {

        for (int number : nums) {
            boolean is1 = number == 1;
            boolean is4 = number == 4;

            if (!is1 && !is4)
                return false;

        }
            
        return true;       

  
      }
      
      
      
    



    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 13};
        int count = countEvens(nums);
        System.out.println(count);  // Output: 3 (since 2, 4, and 6 are even)

        
        int[] sum13 = {1, 2, 13, 2, 3, 1, 13};
        int exclude13 = sum13(sum13);
        System.out.println(exclude13);

        boolean no1And3 = lucky13(sum13);
        System.out.println(no1And3);


        boolean no1And3A = lucky13(sum13);
        System.out.println(no1And3A);

        int[] fizzbuzzArray = fizzArray(10);
        System.out.println(Arrays.toString(fizzbuzzArray));

    }


}