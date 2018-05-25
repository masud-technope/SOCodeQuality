while (i.hasNext()) {
    Map.Entry me = (Map.Entry) i.next();
    System.out.print(me.getKey() + ": ");

    // Cast to a Map again
    Map<String, String> mp = (Map<String, String>) me.getValue();

    // get() works now
    System.out.print("name = " + mp.get("name"));
    System.out.print("pic = " + mp.get("pic"));
    System.out.println("dist = " + mp.get("dist"));
}