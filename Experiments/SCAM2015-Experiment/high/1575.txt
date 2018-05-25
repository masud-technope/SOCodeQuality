Iterator<Integer> it = fib.iterator();
while (it.hasNext())
{
    text.append(it.next().toString());
    text.append("\n");
}