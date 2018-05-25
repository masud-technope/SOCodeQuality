Cookie[] cookies = request.getCookies();

for (int i = 0; i < cookies.length; i++) {
  String name = cookies[i].getName();
  String value = cookies[i].getValue();
}