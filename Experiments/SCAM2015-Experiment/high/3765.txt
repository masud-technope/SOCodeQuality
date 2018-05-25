LoadingCache<String, Optional<Date>> graphs = CacheBuilder.newBuilder()
   .expireAfterWrite(1, TimeUnit.DAYS)
   .build(
       new CacheLoader<String, Optional<Date>>() {
         public Optional<Date>load(Stringkey) throws AnyException {
           return Optional.absent();
         }
       });