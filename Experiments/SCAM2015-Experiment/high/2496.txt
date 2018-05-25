class MyMethodReturnStuff {

    private Object quickAnswer;
    private Future longAnswer;
    private long startTime = System.currentTimeMillis();

    MyMethodReturnStuff(Object quickAnswer, Future longAnswer) {
        this.quickAnswer = quickAnswer;
        this.longAnswer = longAnswer;
    }

    Object getAnswer(long expectedDelay) {
        return System.currentTimeMillis() - startTime < expectedDelay ?
        quickAnswer : longAnswer.get();
    }
}