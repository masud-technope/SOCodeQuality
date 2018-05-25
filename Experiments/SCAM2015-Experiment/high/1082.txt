int[] merge(int[] a, int[] b)
{
    assert (a.length == b.length);

    int[] result = new int[a.length + b.length];

    for (int i=0; i<a.length; i++)
    {
        result[i*2] = a[i];
        result[i*2+1] = b[i];
    }

    return result;
}