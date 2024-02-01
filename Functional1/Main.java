package Functional1;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    // 1
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
        .map(n -> n * 2)
        .collect(Collectors.toList());
    
    }

    // 2
    public static List<String> copies3(List<String> strings) {

        return strings.stream()
        .map(s -> s + s + s)
        .collect(Collectors.toList());
  
    }
    

    // 3
    public static List<Integer> rightDigit(List<Integer> nums) {

        return nums.stream()
        .map(n -> n % 10)
        .collect(Collectors.toList());
  
    }

    // 4
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
      }
      
    


    // 5
    public static List<String> moreY(List<String> strings) {
        
        return strings.stream()
            .map(s -> "y" + s + "y")
            .collect(Collectors.toList());
      }


    // 6
    public static List<String> lower(List<String> strings) {
        return strings.stream()
          .map(s -> s.toLowerCase())
          .collect(Collectors.toList());
      }


    // 7
    public static List<String> addStar(List<String> strings) {
        return strings.stream()
        .map(s -> s + "*")
        .collect(Collectors.toList());
    }
    
    
    // 8
    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream()
            .map(n -> (n + 1) * 10)
            .collect(Collectors.toList());
      }
      

    // 9
    public static List<String> noX(List<String> strings) {
        return strings.stream()
        .map(s -> s.replace("x", ""))
        .collect(Collectors.toList());
    }
    
    
    
    public static void main(String[] args) {

        // 1
        List<Integer> doublingList = List.of(1,2,3,4,5);
        List<Integer> doublingSolution = doubling(doublingList);

        System.out.println(doublingSolution);


        // 3
        List<Integer> rightDigitList = List.of(1, 22, 93);
        System.out.println(rightDigit(rightDigitList));

        List<Integer> nums = List.of(0, 1, 4, 6);
        nums = nums.stream()
          .map(n -> n * 2)
          .filter(n -> n >= 0)
          .collect(Collectors.toList());

        System.out.println(nums);
        

        List<String> strings = List.of("xxax", "xbxbx", "xxcx");

        System.out.println(noX(strings));

    }
}
