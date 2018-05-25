.method public test : (I)V
    .limit stack 2
    .limit locals 4
    iload_1
    newarray int
    astore_2
    iload_1
    anewarray java/lang/String
    astore_3
    getstatic java/lang/System out Ljava/io/PrintStream;
    aload_2
    arraylength
    invokevirtual java/io/PrintStream println (I)V
    getstatic java/lang/System out Ljava/io/PrintStream;
    aload_3
    arraylength
    invokevirtual java/io/PrintStream println (I)V
    return
.end method