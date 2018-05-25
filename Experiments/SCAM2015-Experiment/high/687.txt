public static byte[] dump () throws Exception {

  ClassWriter cw = new ClassWriter(0);
  FieldVisitor fv;
  MethodVisitor mv;
  AnnotationVisitor av0;

  cw.visit(V1_6, ACC_SUPER, "inject/PurchaseOrder$customer_Field",
      "Ljava/lang/Object;"+
      "Linject/PropertyAccessor<Linject/PurchaseOrder;Linject/Customer;>;", 
      "java/lang/Object",
      new String[] { "inject/PropertyAccessor" });
//etc