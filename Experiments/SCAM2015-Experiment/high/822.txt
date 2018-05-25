boolean duplicates(final int[] zipcodelist)
{
  Set<Integer> lump = new HashSet<Integer>();
  for (int i : zipcodelist)
  {
    if (lump.contains(i)) return true;
    lump.add(i);
  }
  return false;
}