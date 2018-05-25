Session session = sessionFactory.getCurrentSession();

if (session != null) {
    session.clear(); // internal cache clear
}

Cache cache = sessionFactory.getCache();

if (cache != null) {
    cache.evictAllRegions(); // Evict data from all query regions.
}