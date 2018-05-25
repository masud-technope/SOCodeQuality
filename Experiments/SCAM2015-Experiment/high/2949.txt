SharedPreferences prefs;

public Storage(Context aContext){
    prefs = aContext.getSharedPreferences("uk.co.kenreid.examplestory", 
            Context.MODE_PRIVATE);
}