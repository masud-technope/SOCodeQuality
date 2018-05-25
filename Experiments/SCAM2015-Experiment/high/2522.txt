NumberHolder holder = uaCount.get(args[1]);
for (int i = 0; i < holder.occurrences; i++)
{
    long value = holder.singleValues.get(i);
    out.write(String.valueOf(value));
    // Maybe out.write(" ") or something similar, as a separator?
}