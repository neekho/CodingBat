package Arrays1;

import java.util.Arrays;

public class Main {

    public static boolean firstLast6(int[] nums) {
  
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }


    public static boolean commonEnd(int[] a, int[] b) {
  
        if (a[0] == b[0]) 
          return true;
        
        return a[a.length - 1] == b[b.length - 1];
    }


    public static int[] reverse3(int[] nums) {
        int[] reversed = new int[nums.length];
        
        for (int i = nums.length - 1; i >= 0; i--) {
              reversed[nums.length - 1 - i] = nums[i];
        }
        
        
        return reversed;
    }


    public static int[] middleWay(int[] a, int[] b) {
  
        return new int[] {a[1], b[1]};
        
      }
      
    public static boolean no23(int[] nums) {

        if ((nums[0] != 2 && nums[0] != 3) && (nums[1] != 2 && nums[1] != 3)) 
          return true;
        
        
        return false;
    }

    public static int[] fix23(int[] nums) {
  
        for (int i = 0; i < nums.length - 1; i++) {
          if (nums[i] == 2 && nums[i + 1] == 3) {
            nums[i + 1] = 0;
          }
        }
        
        return nums;
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
      
      




    public static int[] midThree(int[] nums) {
        
        // kinda challenging challenges goes here
        
        if ((nums.length != 3) &&  nums.length % 2 != 0 ) {
            
            int first = nums[(nums.length / 2) - 1];
            int second = nums[(nums.length / 2)];
            int third = nums[(nums.length / 2) + 1];
            
            return new int[] {first, second, third};
        }
        
        
            return nums;

    }


    public static boolean unlucky1(int[] nums) {
        // fails 1 unit test 
        //unlucky1([1, 1, 1, 3, 1]) → false	| run: true
        
        for (int i = 0; i < nums.length - 1; i++) {
          if (nums[i] == 1 && nums[i + 1] == 3 )
            return true;
        }
        
        return false;
        
      }















      // 2ND COLUMN

    public static boolean sameFirstLast(int[] nums) {
  
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1])
            return true;
      
      
        return false;
        
      }


    public static int sum3(int[] nums) {
  
        int sum = 0;
        
        for(int numbers: nums) 
          sum += numbers;
        
        
        return sum;
        
    }


    public static int[] maxEnd3(int[] nums) {
   
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


    public static int[] makeEnds(int[] nums) {
        int[] firstLast = new int[2];
        
        firstLast[0] = nums[0];
        firstLast[1] = nums[nums.length - 1];
        
        return firstLast;
    }


    public static int[] makeLast(int[] nums) {

        int[] res = new int[nums.length * 2];
    
        // set the last element to whatever is the last element in the nums parameter.
        res[res.length - 1] = nums[nums.length - 1];


        return res;
    }



    public static int start1(int[] a, int[] b) {
  
        int count = 0;
      
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
      
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
      
        return count;
        
    }
      
    public static int[] plusTwo(int[] a, int[] b) {
        int[] newArray = new int [4];
        
        for (int i = 0; i < 2; i++) {
            newArray[i] = a[i];
            newArray[i + 2] = b[i];
        }
            
        return newArray; 
    }

    public static int maxTriple(int[] nums) {       

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

    public int[] make2(int[] a, int[] b) {
        // not done
        if (a.length >= 2)
          return a;
      
        if (b.length >= 2)
          return b;
      
        return new int[]{a[0], b[0]};
        /*if (a.length == 2 && b.length == 0)
          return a;
          
        if (b.length == 2 && a.length == 0)
          return b;
          
        
        
        int[] newArr = new int[2];
        newArr[0] = a[0];
        newArr[1] = b[0];
        
        
        return newArr;*/
    }









    // 3RD COLUMN

    public static int[] makePi() {
      return new int[] {3,1,4};
    }


    public static int[] rotateLeft3(int[] nums) {
      int first = nums[0];
      int second = nums[1];
      int third = nums[2];
      
      return new int[] {second, third, first};
      
    }


    public static boolean has23(int[] nums) {
  
      boolean firstEqual = nums[0] == 2 || nums[0] == 3; 
      boolean secondEqual = nums[1] == 2 || nums[1] == 3; 

  
      
      return firstEqual || secondEqual;

    }

    public static boolean double23(int[] nums) {
  
      if (nums.length >= 2) {
        return nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3);
    
      }
      
      return false;
    }
    

    public static int[] biggerTwo(int[] a, int[] b) {
  
      int aSum = a[0] + a[1];
      int bSum = b[0] + b[1];
      
      boolean firstGreater = aSum > bSum;
      boolean secondGreater = bSum > aSum;
      
      
      if (firstGreater)
        return a;
        
      else if (secondGreater)
        return b;
        
      return a;
      
    }
    
    public static int[] swapEnds(int[] nums) {
  
      int firstNum = nums[0];
      int lastNum = nums[nums.length - 1];
      
      nums[0] = lastNum;  
      nums[nums.length - 1] = firstNum;
      
      return nums;
      
    }

    public static int[] frontPiece(int[] nums) {
  
  
      if (nums.length == 0)
        return nums;
      
      if (nums.length <= 2)
      
        return nums;
        
      

        
      return new int[] {nums[0], nums[1]};
    }


    public static int[] front11(int[] a, int[] b) {
  
      if (a.length == 0 && b.length == 0)
        return new int[] {};
      
      if (b.length == 0)
        return new int[] {a[0]};
      
      if (a.length == 0)
        return new int[] {b[0]};
      
    
      
      return new int[] {a[0], b[0]};
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


        System.out.println(double23(new int[] {2 ,3}));
        System.out.println(double23(new int[] {5 ,5}));


        System.out.println(Arrays.toString(frontPiece(new int[] {2,8,5,6})));

    }



}