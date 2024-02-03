package Functional2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    // 1
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
            .filter(n -> n >= 0)
            .collect(Collectors.toList());
    }


    // 2 
    public static List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
  
        return strings;
    }


    //  3
    public static List<String> noYY(List<String> strings) {
        strings.removeIf(s -> s.endsWith("y"));

        return strings.stream().map(s -> s + "y").collect(Collectors.toList());
    }
    
    


    // 4
    public List<Integer> no9(List<Integer> nums) {
  
        nums.removeIf(n -> n % 10 == 9);
        
        return nums;
        
        //return nums.stream().filter(n -> n % 10 == 9).collect(Collectors.toList());
      }
      

      // 5
      public static List<String> noLong(List<String> strings) {

        return strings.stream()
          .filter(s -> !(s.length() >= 4)) // exclude strings with length greater than or equal to 4.
          .collect(Collectors.toList());


        // OR strings.removeIf(s -> s.size() >= 4)
        // return strings;

      }

      // 6
      public static List<Integer> two2(List<Integer> nums) {
        return nums.stream()
        .map(n -> n * 2)
        .filter(n -> !(n % 10 == 2))
        .collect(Collectors.toList());
      }


      // 7
      public static List<Integer> noTeen(List<Integer> nums) {

        return nums.stream().filter(n -> !(n >= 13 && n <= 19)).collect(Collectors.toList());
  
      }

      // 8
      public static List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);

        return strings;
        
      }


      // 9
      public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
            .map(n -> (n * n) + 10)
            .filter(n -> !(n % 10 == 5 || n % 10 == 6))
            .collect(Collectors.toList());
      }
      
      
      
      
      




    public static void main(String[] args) {
        
    }
}
