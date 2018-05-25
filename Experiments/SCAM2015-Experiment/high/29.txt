List<Cat> cats = MyHibernateUtils.listAndCast(q);

...

public static <T> List<T> listAndCast(Query q) {
    @SuppressWarnings("unchecked")
    List list = q.list();
    return list;
}