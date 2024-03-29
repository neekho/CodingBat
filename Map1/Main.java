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


    // 1
    public static Map<String, String>  mapBully(Map<String, String> map) {


        if (!map.containsKey("a")) 
            return map;
  
        String aValue = map.get("a");

        map.put("a", "");
        map.put("b", aValue);


        return map;
        
  
    }
    

    // 2
    public static Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("bread") || !map.containsKey("bread")) {
            map.put("bread", "butter");

        }
        
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }


        return map;
  
    }


    // 3
    public static Map<String, String> mapAB2(Map<String, String> map) {
        
        boolean bothPresent = map.containsKey("a") && map.containsKey("b");
        
        if (bothPresent) {
            boolean sameValue = map.get("a").equals(map.get("b"));

            if (sameValue) {
                map.remove("a");
                map.remove("b");

                return map;
            }
        }



        return map;
    }
    

    // 4
    public static Map<String, String> mapShare(Map<String, String> map) {
        
        boolean aValue = map.containsKey("a") && map.get("a") != null;

        if (aValue) {
            map.put("b", map.get("a"));
        }

        map.remove("c");


        return map;
    }
    




    

    // 5 
    public static Map<String, String> topping2(Map<String, String> map) {

        boolean iceCream = map.containsKey("ice cream") && map.get("ice cream") != null;
        boolean spinach = map.containsKey("spinach") && map.get("spinach") != null;


        if (iceCream) 
            map.put("yogurt", map.get("ice cream"));

        if (spinach)
            map.put("spinach", "nuts");




        return map;
    }


    // 6
    public static Map<String, String> mapAB3(Map<String, String> map) {

        boolean aValue = map.containsKey("a") && map.get("a") != null;
        boolean bValue = map.containsKey("b") && map.get("b") != null;

        if (aValue && !bValue)
            map.put("b", map.get("a"));
            
        if (bValue && !aValue)
            map.put("a", map.get("b"));

        return map;
  
    }

    //7
    public static Map<String, String> mapAB(Map<String, String> map) {
        
        boolean bothPresent = map.containsKey("a") && map.containsKey("b");

        if (bothPresent)
            map.put("ab", map.get("a") + map.get("b"));

        return map;
    }
    
    

    // 8
    public static Map<String, String> topping3(Map<String, String> map) {

        boolean potato = map.get("potato") != null;
        boolean salad = map.get("salad") != null;


        if (potato)
            map.put("fries", map.get("potato"));

        
        if (salad)
            map.put("spinach", map.get("salad"));


        return map;
  
    }
    

    // 9
    public Map<String, String> mapAB4(Map<String, String> map) {
        
        boolean aPresent = map.get("a") != null;
        boolean bPresent = map.get("b") != null;

        if (aPresent && bPresent) {
            String a = map.get("a");
            String b = map.get("b");

            if (a.length() == b.length()) {
                map.put("a", "");
                map.put("b", "");
            }

            else if (a.length() > b.length()) 
                map.put("c", a);

            else 
                map.put("c", b);

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
