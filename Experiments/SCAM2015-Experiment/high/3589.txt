public Result toResult() {

    Content ret = null;

    try {
        final String jsonpayload = new ObjectMapper().writerWithView(JsonViews.Public.class).writeValueAsString(payload);

         ret = new Content() {
            @Override public String body() { return jsonpayload; }
            @Override public String contentType() { return "application/json"; }
        };
    } catch (JsonProcessingException exc) {
        Logger.error("toResult: ", exc);
    }

    if (ret == null)
        return Results.badRequest();

    return Results.ok(ret);
}