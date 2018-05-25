Compiled from "InlineTest.java"
public class InlineTest extends java.lang.Object{
private static final boolean debug;

public InlineTest();
  Code:
   0:   aload_0
   1:   invokespecial   #1; //Method java/lang/Object."<init>":()V
   4:   return

private void baz();
  Code:
   0:   return

private java.lang.String foo();
  Code:
   0:   aload_0
   1:   invokespecial   #2; //Method bar:()Ljava/lang/String;
   4:   areturn

private java.lang.String bar();
  Code:
   0:   ldc #3; //String abc
   2:   areturn

}