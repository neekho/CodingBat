package Map2;

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
    }
}
