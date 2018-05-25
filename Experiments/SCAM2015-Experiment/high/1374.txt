Compiled from "ConstantFolding.java"
public class ConstantFolding extends java.lang.Object{
private final int a;

private final int b;

public ConstantFolding();
  Code:
   0:   aload_0
   1:   invokespecial   #1; //Method java/lang/Object."<init>":()V
   4:   aload_0
   5:   bipush  100
   7:   putfield    #2; //Field a:I
   10:  aload_0
   11:  sipush  200
   14:  putfield    #3; //Field b:I
   17:  return

public final void baz();
  Code:
   0:   sipush  300
   3:   istore_1
   4:   return

}