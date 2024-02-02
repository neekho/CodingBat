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
      




    public static void main(String[] args) {
        
    }
}
