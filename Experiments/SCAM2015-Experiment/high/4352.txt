private static void getRequiredTag(Context context) throws IOException {
    doSomething(context, new PerformingInterface() {
         @Override public void accept(String tagId, String traceId) {
              tagSet.add(tagId);
         }
    });
}

private static void addTagToTraceId(Context context) throws IOException {
    doSomething(context, new PerformingInterface() {
         @Override public void accept(String tagId, String traceId) {
             Vector<String> ret = traceListMap.get(tagId);
             if (ret == null) {
                 ret = new Vector<String>();
             }
             ret.add(traceId);
             traceListMap.put(tagId, ret);
         }
    });
}