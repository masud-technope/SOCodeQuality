======TP1======
1  class C extends S {
2      void f(){
3          java.lang.System.out.println("foo");
4      }
5  }
6
7  class S {
8      private int java;
9  }
======
% javac C.java
C.java:3: Variable java in class S not accessible from class C.
    java.lang.System.out.println("foo");
    ^
C.java:3: Attempt to reference field lang in a int.
   java.lang.System.out.println("foo");
       ^
2 errors
======