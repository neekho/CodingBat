package Arrays1;

import java.util.List;
import java.util.Arrays;

public class Main {

    public static int[] frontPiece(int[] nums) {
  
        int[] newArray = new int[2];
      
        if (nums.length == 0)
          return nums;
        
        if (nums.length <= 2)
        
          return nums;
          
        
        for (int i = 0; i <= 2; i++) {
            System.out.println(i);
            newArray[i] = nums[i];
            // System.out.println(newArray[i]);

        }
          
        return nums;
      }
      



    public static int[] makeLast(int[] nums) {

        /* 
            Given an int array, return a new array with 
            double the length where its last element is the same as the original array, 
            and all the other elements are 0. 
            The original array will be length 1 or more. 
            Note: by default, a new int array contains all 0's.

            makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
            makeLast([1, 2]) → [0, 0, 0, 2]
            makeLast([3]) → [0, 3]
         */


        int[] res = new int[nums.length * 2];
    
        // set the last element to whatever is the last element in the nums parameter.
        res[res.length - 1] = nums[nums.length - 1];


        return res;
      }

    public static int[] makeMiddle(int[] nums) {

        //{7, 1, 2, 3, 4, 9}
        // returns {2, 3}

        System.out.println(nums.length);
        if (nums.length % 2 == 0) {
            //1st element will return 2
            //2nd element wil return 3
          return new int[] {nums[(nums.length / 2) - 1], nums[nums.length / 2]};
        }


        return nums;
    }

    public static boolean sameFirstLast(int[] nums) {
        

        /*
            Given an array of ints, return true if the array is length 1 or more, 
            and the first element and the last element are equal.

            sameFirstLast([1, 2, 3]) → false
            sameFirstLast([1, 2, 3, 1]) → true
            sameFirstLast([1, 2, 1]) → true

        */


        if (nums.length > 1 && nums[0] == nums[nums.length - 1]){
            return true;
        }


        return false;
    }


    public static int[] maxEnd3(int[] nums) {
        /*
         
            Given an array of ints length 3, figure out which is larger, 
            the first or last element in the array, and set all the other elements to be that value. 
            Return the changed array.

            maxEnd3([1, 2, 3]) → [3, 3, 3]
            maxEnd3([11, 5, 9]) → [11, 11, 11]
            maxEnd3([2, 11, 3]) → [3, 3, 3]
         */


         int firstNumber = nums[0];
         int lastNumber = nums[nums.length - 1];


         boolean firstGreater = firstNumber > lastNumber;
         
         if (firstGreater) {
            return new int[] {firstNumber, firstNumber, firstNumber};
         } 
         else
            return new int[] {lastNumber, lastNumber, lastNumber};


            /*
                or:
                int max = Math.max(nums[0], nums[2]);
                nums[0] = max;
                nums[1] = max;
                nums[2] = max;
                return nums;
             */
    }
    
    

    public static void main(String[] args) {

        System.out.println(sameFirstLast(new int[] {1,2,3}));
        System.out.println(sameFirstLast(new int[] {1,2,1}));

        int[] newArr = maxEnd3(new int[] {1,2,3});
        int[] newArr2 = maxEnd3(new int[] {11,2,3});

        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(newArr2));

        int[] middleThree = midThree(new int[] {1,2,3,4,5});

        System.out.println(Arrays.toString(middleThree));


        
    }

    
    // kinda challenging challenges goes here

    public static int[] midThree(int[] nums) {

        /*
         
            Given an array of ints of odd length, return a new array length 3 containing the elements 
            from the middle of the array. The array length will be at least 3.

                midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
                midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
                midThree([1, 2, 3]) → [1, 2, 3]
         */
    
        
        if ((nums.length != 3) &&  nums.length % 2 != 0 ) {
            
            int first = nums[(nums.length / 2) - 1];
            int second = nums[(nums.length / 2)];
            int third = nums[(nums.length / 2) + 1];
            
            return new int[] {first, second, third};
        }
        
        
            return nums;

        }


    public static int maxTriple(int[] nums) {
        /*    
            Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
            
                maxTriple([1, 2, 3]) → 3
                maxTriple([1, 5, 3]) → 5
                maxTriple([5, 2, 3]) → 5
         */

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
            
            
        if (nums.length % 2 != 0) {
            int max = nums[0];
            int first = nums[0];
            int middle = nums[(nums.length / 2)];
            int last = nums[nums.length - 1];
              
            if (first > max)
                max = first;
                
            if (middle > max)
                max = middle;
                
              
            if (last > max)
                max = last;
                
                
            return max;
        }

        return nums[0];
}


