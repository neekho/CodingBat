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

    int firstDigitA = a / 10;
    
    int firstDigitB = b / 10;
    
    int lastDigitA = a % 10;
    
    int lastDigitB = b % 10;

    return firstDigitA == firstDigitB || lastDigitA == lastDigitB || firstDigitA == lastDigitB || firstDigitB == lastDigitA;
  
  }



  // 3rd column

  // 1
  public static boolean squirrelPlay(int temp, boolean isSummer) {
    if (temp >= 60 && temp <= 90) 
      return true;
    
    else if (isSummer && (temp>= 60 && temp <= 100)) 
     return true;
    
    
    
    return false;

    // alternate     return (temp >= 60 && temp <= 90) || (isSummer && temp >= 60 && temp <= 100);

  }

  // 2
  public static String alarmClock(int day, boolean vacation) {

    boolean isWeekend = day == 0 || day == 6;

    if (vacation && !isWeekend)
      return "10:00";

    else if (vacation && isWeekend)
     return "off";

    else if (isWeekend)
      return "10:00";

    return "7:00";
  
  }
  
  
  
  // 3 
  public static boolean specialEleven(int n) {
    return n % 11 == 0 || n % 11 == 1;
  }
  

  // 4
  public static boolean less20(int n) {
    return n % 20 == 18 || n % 20 == 19;

  }




  // 5
  public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

  
    if (isAsleep)
      return false;
  
    else if (isMom && isMorning)
      return true;
      
    else if (isMorning)
      return false;

    return true;

    // alternatively, 
    /*
          if (isAsleep) {
            return false;
          }
      
          if (isMorning && !isMom) {
            return false;
          }
      
        return true;
      
    */ 
  
  }

  // 6
  public static String fizzString2(int n) {


    boolean fizz = n % 3 == 0;
    boolean buzz = n % 5 == 0;

    if (fizz && buzz) 
      return "FizzBuzz!";

    else if (fizz)
      return "Fizz!";

    else if (buzz)
      return "Buzz!";

    return n + "!";
  }



  // 7
  public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

  
    if (equalOk) 
       return (a <= b && b <= c); // 5,5,7, true, -> true
    
    else 
        return (a < b && b < c); // if its ascending order return true // 5,5,7 false, -> false
    
  }
  
  


  // 8
  public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
    
    int result = 0;
    boolean sameResult = die1 == die2;

    if (sameResult && !noDoubles) {
        result = die1 + die2;

    } else if (sameResult && noDoubles) {
        result = die1 == 6 ? die1 + 1 : die1 + 1 + die2;

    } else if (!sameResult && noDoubles) {
        result = die1 + die2;

    } else {
        result = die1 + die2;
    }

    return result;

  }
  




  // 9

  public static int greenTicket(int a, int b, int c) {
    
    if (a != b && b != c) {
      return 0;

    } else if (a == b && b == c) {
        return 20;



    } else {
        return 10;
    }



  }

  // 10
  public static int sumLimit(int a, int b) {

    int sum = a + b;

    int sumDigits = Integer.toString(sum).length();

    int aDigits = Integer.toString(a).length();

    if (sumDigits == aDigits) 
      return sum;

    else if (sumDigits > aDigits) 
      return a;
    

    return sum;
  }
  
  
  
    
    public static void main(String[] args) {
        
    }
}
