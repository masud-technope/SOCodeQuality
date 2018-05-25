private static HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
private static JsonFactory JSON_FACTORY = new com.google.api.client.json.jackson2.JacksonFactory();

private static Long getSubscriptionExpire(String accessToken, String refreshToken, String subscriptionId, String purchaseToken){

try{

    TokenResponse tokenResponse = new TokenResponse();
    tokenResponse.setAccessToken(accessToken);
    tokenResponse.setRefreshToken(refreshToken);
    tokenResponse.setExpiresInSeconds(3600L);
    tokenResponse.setScope("https://www.googleapis.com/auth/androidpublisher");
    tokenResponse.setTokenType("Bearer");

    HttpRequestInitializer credential =  new GoogleCredential.Builder().setTransport(HTTP_TRANSPORT)
            .setJsonFactory(JSON_FACTORY)
            .setClientSecrets(GOOGLE_CLIENT_ID, GOOGLE_CLIENT_SECRET)
            .build()
            .setFromTokenResponse(tokenResponse);

    Androidpublisher publisher = new Androidpublisher.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential).
            setApplicationName(GOOGLE_PRODUCT_NAME).
            build();

    Androidpublisher.Purchases purchases = publisher.purchases();
    Get get = purchases.get(GOOGLE_PACKAGE_NAME, subscriptionId, purchaseToken);
    SubscriptionPurchase subscripcion = get.execute();

    return subscripcion.getValidUntilTimestampMsec();

}
catch (IOException e) { e.printStackTrace(); }
return null;