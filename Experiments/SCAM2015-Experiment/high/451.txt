public BaseTable(int rows, int cols, T prototype)
{       
  mRows = rows;
  mCols = cols;
  prototype.setColumns(cols);
  mEntries = new ArrayList<T>();
  for (int i = 0; i < rows; i++)
  {
    @SuppressWarnings("unchecked")
    T newClone = (T)prototype.clone();
    mEntries.add(newClone); //this obv. does work :)
  }
}

public static void main(String[] args)
{
  new BaseTable<SimpleTableEntry>(10, 2, new SimpleTableEntry());
}