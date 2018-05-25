public void getFoobars() {
{
    EntityManager em = ... // EM by injection, EntityManagerFactory, whatever

    CriteriaBuilder b = em.getCriteriaBuilder();
    CriteriaQuery<Foobar> cq = b.createQuery(Foobar.class);
    Root<Foobar> foobar = cq.from(Foobar.class);

    TypedQuery<Foobar> q = em.createQuery(
            cq.select(foobar)
              .where(b.isMember("abc123", foobar.<List<String>>get("uuids"))));

    for (Foobar f : q.getResultList()) {
        // Do stuff with f, which will have "abc123" in uuids
    }
}