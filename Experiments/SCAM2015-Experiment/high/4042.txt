@SuppressWarnings("unchecked")
public static <B extends BaseB> BaseA transform(B b) {
  Transform<? extends BaseA, B> t = 
    (Transform<? extends BaseA, B>)_map.get(b.getClass());
  return t.toA(b);
}