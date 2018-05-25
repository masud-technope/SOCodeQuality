private static void doSomething(Context context, PerformingInterface perform) throws IOException
  {
    String traceId = null, tagId = null;
    for (Record record : context.getContext().readCacheTable("subscribe")) {
      getTraceIdAndTagIdFromRecord(record, traceId, tagId);
      if (traceSet.contains(traceId) == false)
        continue;
      if (!checkTagIdIsNumber(tagId))
      {
        context.getCounter("Error", "tag_id not a number").increment(1);
        continue;
      }
      perform.accept(tagId, traceId);
    }    
  }