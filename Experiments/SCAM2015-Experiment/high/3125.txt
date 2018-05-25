Map<Integer, String> map = new HashMap<>();
map.put(0,"games");
map.put(1,"softwares");
map.put(2, "music");
/*****
 And so on
*****/
int pos = getIntent().getIntExtra("key",0);
String url = "file:///android_asset/"+map.get(pos)+".html"
web.loadUrl(url);