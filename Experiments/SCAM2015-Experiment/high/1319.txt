public static void main(String[] args) throws IOException
{
    long[] latency = { 123456789000L, 234567890000L, 345678901000L };

    BufferedWriter out = new BufferedWriter(new FileWriter("latency.txt"));
    for (int i = 0; i < 3; ++i) {
        out.write(latency[i] + "\n");
    }
    out.close();
}