public class Table extends java.util.HashMap<String, Integer> {
       public Integer put(String key, Integer value) {
          if (containsKey(key)) {
           // implement the logic you need here.
           // You might want to return `value` to indicate
           // that no changes applied
           return value;
          } else {
            return super.put(key, value);
          }
       }
    }