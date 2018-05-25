// Instantiation of the StringBuilder outside loop:
   33:  new #8; //class java/lang/StringBuilder
   36:  dup
   37:  invokespecial   #9; //Method java/lang/StringBuilder."<init>":()V
   40:  astore_2

   // [snip a few lines for initializing the loop]
   // Loading the StringBuilder inside the loop, then append:
   66:  aload_2
   67:  aload   4
   69:  invokevirtual   #14; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   72:  pop
   73:  aload_2
   74:  ldc #15; //String \t
   76:  invokevirtual   #14; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   79:  pop