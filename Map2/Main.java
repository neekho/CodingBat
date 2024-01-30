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
    


    
    public static void main(String[] args) {

        String[] test = {"a", "b", "c", "d", "e", "a"};

        Map<String, Integer> myMap = wordCount(test);

        System.out.println(myMap);
        
    }
}
