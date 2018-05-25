@SuppressWarnings("unchecked")
public <T> T[] ConvertToArray(List<T> list)
{      
   Object[] result = new Object[list.size()];
   result = list.toArray(result);
   return (T[])result;
}