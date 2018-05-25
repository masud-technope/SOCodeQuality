c:\dev\src\misc>javap -c Main
Compiled from "Main.java"
public class Main {
  public Main();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":
()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/Long.TYPE:Ljava/lang/Class;
       3: astore_1
       4: getstatic     #2                  // Field java/lang/Long.TYPE:Ljava/lang/Class;
       7: astore_2
       8: return
}