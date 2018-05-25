public static void main(String[] args) {
    String[] values = {"124.50", "45.801", "-15.210"};
    List<MyDouble> nums = new ArrayList<MyDouble>();

    for(String s: values)
    nums.add(new MyDouble(s));
    Collections.sort(nums);

    for(MyDouble d: nums){
        System.out.print(d + " ");
    }
}

static class MyDouble implements Comparable<MyDouble> {
    final double val;
    final String string;
    MyDouble(String str) {
        string = str;
        val = Double.parseDouble(str);
    }

    @Override
    public String toString() {
        return string;
    }

    @Override
    public int compareTo(MyDouble o) {
        return (int) (val - o.val);
    }
}