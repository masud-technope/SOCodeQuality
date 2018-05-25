final AtomicReference<String> resultXml = new AtomicReference<String>();

RegexpThread rt = new RegexpThread() {
  public void run() {
    method2(m, urlCopy, document, resultXml);
  }

};

rt.start();

try {
    rt.join(6 * 1000);
} catch (InterruptedException e) {
    return "y";
}

if(resultXml.get() == null) {
    rt.interupt();
    return "g";
}

resultXml.append(resultXml.get());

return resultXml.toString();