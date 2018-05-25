class UsageClass {
    private static final LogUtility logger = LogUtility.getLogger();

    public static void main( String [] args ) {

        UsageClass usageClass = new UsageClass();

        usageClass.methodOne();
        usageClass.methodTwo();
        usageClass.methodThree();

    }
    private void methodOne() {
        logger.log("One");
    }
    private void methodTwo() {
        logger.log("Two");
    }
    private void methodThree() {
        logger.log("Three");
    }
}