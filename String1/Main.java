package String1;

public class Main {

    public static String helloName(String name) {
        return "Hello" + " "+ name + "!";

    
    }


    public String makeOutWord(String out, String word) {
        String left = out.substring(0,2);
        String right = out.substring(2, 4);
        return left +word + right;
    }

    public static String firstHalf(String str) {
  
        if (str.length() == 0)
          return str;
          
        
        if (str.length() % 2 == 0)
          return str.substring(0, str.length() / 2);
        
        
        return str.substring(0,3);
    }


    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }
      
    public String theEnd(String str, boolean front) {
   
        if (front)
         return str.substring(0, 1);
         
       return str.substring(str.length() - 1);
    }


    public static boolean endsLy(String str) {
      

        return str.endsWith("ly");
    }


    public static String middleThree(String str) {
        
        if (str.length () % 2 != 0 ) {
            return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
        }

        return "";
    }

    public static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
    
        if (b.length() == 0) {
            b = "@";
        }
    
        String firstA = (a.length() > 0) ? a.substring(0, 1) : "@";
        String lastB = (b.length() > 0) ? b.substring(b.length() - 1) : "@";
    
        return firstA + lastB;
    }

    public static String extraFront(String str) {
  
        if (str.length() >= 2) 
          return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
      
      
      
        return str + str + str;
        
    }

    public String startWord(String str, String word) {
        if (str.startsWith(word))
          return str.substring(0,2);
        
          
        if (str.startsWith(word.substring(1,2)))
           return str.substring(0,2);
          
          
        return str.substring(0,1);
    }

    public static String extraEnd(String str) {
  
        if (str.length() > 3) {
          String end = str.substring(str.length() - 2);
          return end + end + end;
        }
            
        return str + str + str;
    }


    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
      
      
      
    public static String withoutEnd2(String str) {
  
        if (str.length() <= 1) {
          return "";
        }
        
        
        return str.substring(1, str.length() - 1); 
    }

    public static String nTwice(String str, int n) {
        return "";
    }
    




    public static boolean hasBad(String str) {
  
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
             return true;
         }
     
         if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
             return true;
         }
     
         return false;
    }


    public static String conCat(String a, String b) {
                // NOT DONE

        return "";
    }

    public boolean frontAgain(String str) {
  
        if (str.length() >= 2) {
          String end = str.substring(str.length() - 2);
      
          return str.substring(0,2).equals(end);
        }
        
        return false;
    }
      
    public static String without2(String str) {
        // NOT DONE

        return "";
    }
    

    public static String withoutX(String str) {
        // NOT DONE
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1);

        if (first.equals("x")) {
            return str.substring(1);
        }
        
        if (last.equals("x")) {
            return str.substring(0, str.length() - 1);
        }

        return str;
    }
      







    // 3rd column






    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
      }
      

    public static String firstTwo(String str) {
  
        if (str.length() == 1) {
          return str.substring(0);
        }
        
        if (str.length() >= 2) {
          return str.substring(0, 2);
        }
        
        return "";
    }

    public static String comboString(String a, String b) {
  
        if (a.length() > b.length()) {
            return b + a + b;
      
        } 
        
        
        
        return a + b + a;
      }
      

    public static String middleTwo(String str) {
  
        if (str.length() >= 4) {
          return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        }
        
        return str;
    }
      
    
    
     


      
      
    
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
    }
}
