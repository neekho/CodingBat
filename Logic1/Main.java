package Logic1;

public class Main {

    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend)
          return cigars >= 40;
        return (cigars >= 40 && cigars <= 60);
    }









    
      
    public static boolean love6(int a, int b) {
 
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
        
      }
      
    
    public static void main(String[] args) {
        
    }
}
