package Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    // 1
    public static Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, 0);
            }
        }

        return map;
  
    }


    // 2 
    public static Map<String, Integer> wordCount(String[] strings) {

        
        Map<String, Integer> map = new HashMap<>(); 


        for (String string : strings) {
            if (!map.containsKey(string)) { 
                map.put(string, 1); // first time seeing the string, add an initial value of 1
            }

            else {

                int count = map.get(string);

                map.put(string, count += 1);
            }
        }

        return map;

    }


    //3 
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> myMap = new HashMap<>();


        for (String string : strings) {

            if (!myMap.containsKey(string)) {
                myMap.put(string, false); // string only occurred once.
            } 

            else {
                myMap.put(string, true);
            }
        }

        return myMap;
    }



    // 4
    public static Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();


        for (String string: strings) {

            if (!map.containsKey(string)) {
                map.put(string, string.length());
            }


        }


        return map;
  
    }

    // 5
    public static Map<String, String> firstChar(String[] strings) {
        
        Map<String, String> map = new HashMap<>();


        for (String string : strings) {

            String firstLetter = string.substring(0, 1);

            if (!map.containsKey(firstLetter)) {
                map.put(firstLetter, string);
            }

            else {
        
                String currentValue = map.get(firstLetter);
                map.put(firstLetter, currentValue + string);
        
            }
        }


        return map;

    }
    
    


    // 6
    public static String[] allSwap(String[] strings) {

        // allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → 
        //["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]

        Map<String, Integer> map = new HashMap<>();

        System.out.println(Arrays.toString(strings));


        for (int i = 0; i < strings.length; i++) {
            // Extract the first character of the current string
            String firstChar = strings[i].substring(0, 1);


            if (map.containsKey(firstChar)) { // If the first character is already in the map, perform a swap
                
                int indexToSwap = map.get(firstChar);

                swap(strings, indexToSwap, i);

                // Remove the key from the map as it won't match anything in the future
                System.out.println(Arrays.toString(strings));
                map.remove(firstChar);

            } else {
                // If the first character is not in the map, add it along with its index
                map.put(firstChar, i);

            }
        }

        return strings;
      
    }


    // 7
    public static Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for (String string : strings) {

            String firstLetter = string.substring(0, 1);
            String lastLetter = string.substring(string.length() - 1);

            if (!map.containsKey(string)) {
                map.put(firstLetter, lastLetter);
            }
        }



        return map;
  
    }


    // 8
    public static String wordAppend(String[] strings) {


        Map<String, Integer> map = new HashMap<>();
        String result = "";

        for (String str : strings) {
            int count = map.getOrDefault(str, 0);
            System.out.println(count);
            map.put(str, count + 1);

            if (count % 2 == 1) {
                result += str;
            }
        }
    
        return result;
  
    }


    //9
    public static String[] firstSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int iteration = 0; iteration < strings.length; iteration++) {

            boolean notEmpty = strings[iteration] != null;
            String firstLetter = strings[iteration].substring(0, 1);

            if (notEmpty && map.containsKey(firstLetter)) {
                
                int match  = map.get(firstLetter);

                if (strings[match] != null && strings[iteration] != null) {

                    String temp = strings[match];

                    strings[match] = strings[iteration];

                    strings[iteration] = temp;
                }

            }

            else {
                map.put(firstLetter, iteration);
            }


        }

        return strings;
  
    }
    


    // Swap two elements in the array 6th problem
    private static void swap(String[] strings, int i, int j) {
        String temp = strings[i];
        strings[i] = strings[j];
        strings[j] = temp;
    }
    
    
    
    
    public static void main(String[] args) {

        String[] test = {"a", "b", "c", "d", "e", "a"};

        
        Map<String, Integer> myMap = wordCount(test);
        
        System.out.println(myMap);
        
        
        
        String[] firstChar = {"salt", "tea", "soda", "toast"};
        String[] firstChar1 = {"aa", "bb", "cc", "aAA", "cCC", "d"};

        Map<String, String> firstMap = firstChar(firstChar1);


        System.out.println(firstMap);



        String[] pairsArray = {"man", "moon", "main"};
        Map<String, String> pairMap = pairs(pairsArray);

        System.out.println(pairMap);


        String[] wordAppendArray = {"a", "b", "a"};
        String wordAppendMap = wordAppend(wordAppendArray);

        System.out.println(wordAppendMap); 
        System.out.println();



         // Test cases
        String[] input1 = {"ab", "ac"};
        String[] input2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] input3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        System.out.println("ALL SWAP");
        System.out.println(Arrays.toString(allSwap(input1))); // Output: ["ac", "ab"]
        System.out.println(Arrays.toString(allSwap(input2))); // Output: ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
        System.out.println(Arrays.toString(allSwap(input3))); // Output: ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
    }
}
