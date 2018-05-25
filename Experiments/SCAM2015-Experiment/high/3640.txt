private String getUrl(Double lat, Double long) {
   if(lat != null && lng!= null) {
      String URL = "http://xyz.in/api/stores/around_me.json?app_id=test&lat="
                + lat + "&lng=" + lng;
      return URL;
   }
   else {
      String URL = "http://xyz.in/api/stores/around_me.json?       
                           app_id=test&lat=12.58&lng=77.38";
      return URL;
   }
}