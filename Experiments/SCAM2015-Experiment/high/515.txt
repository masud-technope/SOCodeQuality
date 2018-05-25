public java.lang.String getName(EnumClass);
  Code:
   0:   getstatic       #2; //Field EnumUser$1.$SwitchMap$EnumClass:[I
   3:   aload_1
   4:   invokevirtual   #3; //Method EnumClass.ordinal:()I
   7:   iaload
   8:   lookupswitch{ //2
                1: 36;
                2: 39;
                default: 42 }
   36:  ldc     #4; //String value 1
   38:  areturn
   39:  ldc     #5; //String value 3
   41:  areturn
   42:  ldc     #6; //String other
   44:  areturn