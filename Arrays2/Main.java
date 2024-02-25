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
    }


}