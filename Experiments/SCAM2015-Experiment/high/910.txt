public class Table {
       protected java.util.HashMap<String, Integer> map = 
             new java.util.HashMap<String, Integer>();

       public Integer get(String key) { return map.get(key); }

       public Integer put(String key, Integer value) {
          if (map.containsKey(key)) {
           // implement the logic you need here.
           // You might want to return `value` to indicate
           // that no changes applied
           return value;
          } else {
            return map.put(key, value);
          }
       }
       // other methods goes here
    }