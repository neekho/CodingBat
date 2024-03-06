package String2;

public class Main {

    // 1
    public static String doubleChar(String str) {

        StringBuilder doubled = new StringBuilder();
    
        for (char c : str.toCharArray()) {
            String currentChar = String.valueOf(c);
            doubled.append(currentChar).append(currentChar);
        }
    
        return doubled.toString();
    }


    // 2
    public static int countCode(String str) {
        int count = 0;
    
        for (int i = 0; i < str.length() - 3; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            char third = str.charAt(i + 2);
            char fourth = str.charAt(i + 3);
    
            if (first == 'c' && second == 'o' && fourth == 'e' && (third >= 'a' && third <= 'z')) {
                count++;
            }
        }
    
        return count;
    }


    // 3 
    public boolean bobThere(String str) {

        boolean bobExist = false;

        for (int i = 0; i < str.length() - 2; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            char third = str.charAt(i + 2);
        
    
            if (first == 'b' && (second != 'b' || third == 'b')) {
                bobExist = true;
            }
        }


        return bobExist;
  
    }


    // 4
    public static String repeatEnd(String str, int n) {

        StringBuilder result = new StringBuilder();

        String end = str.substring(str.length() - n);

        for (int i = 0; i < n; i++) {
      
            result.append(end);
        }


        return result.toString();
  
    }
    

    // 7
    public static String starOut(String str) {

        // ab*cd

        int indexOfStar = str.indexOf("*");

        int leftOfStar = indexOfStar - 1;

        int rightOfStar = indexOfStar + 1;


        String first = str.substring(0, leftOfStar);
        String second = str.substring(rightOfStar + 1, str.length());
    



        return first + second;
  
    }
    
    


    // 8
    public static int countHi(String str) {
        int count = 0;
    
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
    
            if (currentChar == 'h' && nextChar == 'i') {
                count++;
            }
        }
    
        return count;

        /*  for (int i = 0; i < (str.length() - 1); i++) {
            if (str.substring(i, i+2).equals("hi")) count++;
        } */
    }
    
    
    
    
    
    public static void main(String[] args) {


        System.out.println(doubleChar("hello"));

        System.out.println(countCode("aaacodebbb"));

        System.out.println(countHi("abc hi ho"));

        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("1234", 2));


        System.out.println(starOut("ab*cd"));

        
    }
}
