package Map1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final HashMap<String , String> MENU = new HashMap<String , String>() {{
        put("a", "1 PC Chicken Joy with Rice");
        put("b", "");
        put("M1", "Peach Mango Shanghai");
        put("Y1", "Yumburger");
    }};


    public static Map<String, String>  mapBully(Map<String, String> map) {


        if (!map.containsKey("a")) 
            return map;
  
        String aValue = map.get("a");

        map.put("a", "");
        map.put("b", aValue);


        return map;
        
  
    }
    

    public static Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("bread") || !map.containsKey("bread")) {
            map.put("bread", "butter");

        }
        
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }


        return map;
  
    }
    


    public static void main(String[] args) {

        // HashMap<String, String> myMap = new HashMap<>();
        // myMap.put("a", "apple");
        // myMap.put("b", "bola");

        // HashMap<String, String> myMap1 = new HashMap<>();

        // myMap1.put("b", "bola");
     
        // System.out.println(mapBully(myMap));
        // System.out.println(mapBully(myMap1));

        // HashMap<String, String> topping = new HashMap<>();
        // topping.put("ice cream", "bola");
        // topping.put("bread", "bola");
        // topping.put("pancake", "syrup");


        // System.out.println(topping1(topping));


    }
}
