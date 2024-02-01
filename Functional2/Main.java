package Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // 1
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
            .filter(n -> n >= 0)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        
    }
}
