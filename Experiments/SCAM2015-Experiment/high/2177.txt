long now = System.currentTimeMillis();
long end = now + (60 * 1000);
Calendar c = Calendar.getInstance();

for (long i = now; i < end; i += 15000) {

    c.setTimeInMillis(i);
    System.out.println(c.getTime());
}