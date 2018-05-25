HttpClient httpClient = new DefaultHttpClient();
// execute get/post/put or whatever
httpClient.doGetPostPutOrWhatever();
// get cookieStore
CookieStore cookieStore = httpClient.getCookieStore();
// get Cookies
List<Cookie> cookies = cookieStore.getCookies();
// process...