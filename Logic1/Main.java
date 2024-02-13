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
    public int caughtSpeeding(int speed, boolean isBirthday) {
      if (speed <= 60) 
        return 0;
      
      else if ((isBirthday) && speed >= 61 || speed <= 80) 
        return 1;
      
      else if (speed >= 81) 
        return 2;
    
    
    return 0;
   }
  

    


    // 3
    public static boolean love6(int a, int b) {
 
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
        
      }



    // 4
    public boolean more20(int n) {
      if (n % 20 == 1 || n % 20 == 2) {
        return true;
      }

      return false;
  
    }


    // 5
    public static boolean nearTen(int num) {
      return (num % 10 <= 2 || num % 10 >= 8);
    
      
    }
    



    // 6
    public static int teaParty(int tea, int candy) {

      if (tea < 5 || candy < 5) return 0;
      
      else if (tea >= candy * 2 || candy >= tea * 2) return 2;
      
      
      else if (tea >=5 || candy >= 5) return 1;
      
      
      return tea;

  
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


    // 8
    public static boolean lastDigit(int a, int b, int c) {
      int first = a % 10;
      int sec = b % 10;
      int third = c % 10;


      return first == sec || sec == third || first == third;



    }

    // 9
    public static int maxMod5(int a, int b) {

      int aRemainder = a % 5;
      int bRemainder = b % 5;
      
      if (a == b)
        return 0;


      if (aRemainder == bRemainder) 
        return Math.min(aRemainder, bRemainder);
      

      return Math.max(a, b);
  
    }


    // 10
    public static int blueTicket(int a, int b, int c) {

      int pairOne = a + b;
      int pairTwo = b + c;
      int pairThree = a + c;

      boolean sum10 = pairOne == 10 || pairTwo == 10 || pairThree == 10;

    
      if (sum10) // if one of the pairs are summed to 10
        return 10;
      
      //blueTicket(15, 0, 5) → 5
      // pairOne = a + b = 15
      // pairTwo = b + c = 5
      // pairThree = a + c = 20

      // 15 - 5 = 10 so it returned 5
      // 15 - 20 = -5 disregard by run time
      else if (pairOne - pairTwo == 10 || pairOne - pairThree == 10)
        return 5;
      
      return 0;
    }
    
    


    


    
    // 2nd column

    // 1
    public static int dateFashion(int you, int date) {

      int result = 1;

      if (you <= 2 || date <= 2)
        result = 0;


      if (you >= 8 || date >= 8)
        result = 2;

      return result;
  
    }
    

    
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

  // 8


  // 9
  public static int redTicket(int a, int b, int c) {

    int result = 0;

    boolean all2 = a == 2 && b == 2 && c == 2;

    boolean allSame = a == b && b == c && a == c;

    boolean notA = b != a && c != a;
    

    if (allSame && !all2) result = 5;


    else if (all2) result = 10;


    else if (notA) result = 1;



    return result;
  
  }
  


  // 10
  public static boolean shareDigit(int a, int b) {

    int firstDigit = a / 10;
    int lastDigit = b % 10;

    return firstDigit == lastDigit;
  
  }
  
  
      
    
    public static void main(String[] args) {
        
    }
}
