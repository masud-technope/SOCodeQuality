Cache<String, Optional<Date>> cache = new SimpleForwardingCache<>(grapsh){

      public Optional<Date>get(String key, Callable<Optional<Date>> valueLoader){
           Optional<Date> result = delegate().get(key, valueLoader);
           if (!result.isPresent() || olderThanADay(result.get()))
                return Optional.absent();
           else
                return result;
      }

      // since you don't really need a valueLoader you might want to add this.
      // this is in place of the LoadingCache, if use LoadingCache use 
      // ForwardingLoadingCache
      public Date get(String key){
          return get(key, 
               new Callable<Optional<Date>>(){
                 public Date call(){return Optional.absent();}
               }
      }
 }