0:   ldc #37; //String Helloworld
   2:   astore_1
   3:   new #39; //class java/lang/StringBuilder
   6:   dup
   7:   aload_1
   8:   invokestatic    #41; //Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   11:  invokespecial   #47; //Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
   14:  ldc #50; //String Java
   16:  invokevirtual   #52; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   19:  invokevirtual   #56; //Method java/lang/StringBuilder.toString:()Ljava/lang/String;
   22:  astore_2
   23:  return