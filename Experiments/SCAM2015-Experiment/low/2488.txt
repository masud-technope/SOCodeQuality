public static PublicKey bigIntegerToPublicKey(BigInteger e, BigInteger m)  {
    RSAPublicKeySpec keySpec = new RSAPublicKeySpec(m, e);
    KeyFactory fact = KeyFactory.getInstance("RSA");
    PublicKey pubKey = fact.generatePublic(keySpec);
    return pubKey;
}

public static PrivateKey bigIntegerToPrivateKey(BigInteger e, BigInteger m) {
    RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(m, e);
    KeyFactory fact = KeyFactory.getInstance("RSA");
    PrivateKey privKey = fact.generatePrivate(keySpec);
    return privKey;
}