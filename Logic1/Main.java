package Logic1;

import java.util.Arrays;

public class Main {

    // 1ST COLUMN

    // 1
    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend)
          return cigars >= 40;
        return (cigars >= 40 && cigars <= 60);
    }




    // 2

    


    // 3
    public static boolean love6(int a, int b) {
 
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
        
      }









    // 7
    public static boolean twoAsOne(int a, int b, int c) {
  
      // int[] nums = {a, b, c};
      // Arrays.sort(nums);

      // return nums[0] + nums[1] == nums[2];
      // OR

      if (a + b == c)
      return true;
      
      if (b + c == a)
        return true;
        
        
      if (a + c == b)
        return true;
    
    
      return false;
        
      
      
    }


    


    
    // 2nd column

    
    //2. 
    public static int sortaSum(int a, int b) {
      if (a + b >= 10 && a + b <= 19)
        return 20;
        
      
      return a + b;
    }

    //3 
    public static boolean in1To10(int n, boolean outsideMode) {
      if (outsideMode)
        return n <= 1 || n >= 10;
      
      return n >= 1 && n <= 10;
    }

    // 4
    public static boolean old35(int n) {
      //return n % 3 == 0 || n % 5 == 0;
      return (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0);
    
    }


    // 5 
    public static int teenSum(int a, int b) {
      boolean aTeen = a >= 13 && a <= 19;
      boolean bTeen = b >= 13 && b <= 19;
      
      if (aTeen || bTeen)
       return 19;
        
     return a + b;
    
   }
    
  // 6
  public String fizzString(String str) {
  
    boolean fizz = str.startsWith("f");
    boolean buzz = str.endsWith("b");
    
    if (fizz && buzz)
      return "FizzBuzz";
      
    else if (fizz)
      return "Fizz";
    
    else if (buzz)
      return "Buzz";
      
    return str;
  }


  // 7
  public static boolean inOrder(int a, int b, int c, boolean bOk) {
  
    if (bOk)
      return c > b;
    
    return b > a && c > b;
  }
  
      
    
    public static void main(String[] args) {
        
    }
}
