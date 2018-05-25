java.lang.String test(java.lang.String);
  Code:
   Stack=3, Locals=2, Args_size=2
   0:   new #16; //class java/lang/StringBuilder
   3:   dup
   4:   ldc #18; //String string 1 
   6:   invokespecial   #20; //Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
   9:   aload_1
   10:  invokevirtual   #23; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   13:  ldc #27; //String  string 2 
   15:  invokevirtual   #23; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   18:  ldc #29; //String string 3
   20:  invokevirtual   #23; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   23:  invokevirtual   #31; //Method java/lang/StringBuilder.toString:()Ljava/lang/String;
   26:  areturn