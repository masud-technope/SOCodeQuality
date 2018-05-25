String[] arr = new String[] {"Alex Jones", "Robert Flip", "Farabi Fahim"};
StringBuilder sbd = new StringBuilder("[");
for (int i = 0; i < arr.length; i++) {
    sbd.append(arr[i]);
    if (i < arr.length - 2)
        sbd.append(", ");
    else if (i < arr.length - 1)
        sbd.append(" & ");
}
sbd.append(']');
System.out.printf("%s%n", sbd);