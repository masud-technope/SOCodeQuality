public List<Program> findBySubscriber(Subscriber subscriber) {
  String hql = "select p " +
     "from Program p " +
     " join p.subscribers s " +
     "where s = :sub"
     ;    

  Query q = getSession().createQuery(hql);
  q.setEntity("sub", subscriber);

  List<Program> l = q.list();
  return l;
}