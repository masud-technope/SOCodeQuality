public final Integer putToMap(String key, String value) {
   if(this.map.containsKey(key)) {
      return value;
   } else {
      return this.map.put(key, value);
   }
}