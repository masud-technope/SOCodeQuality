{
mv = cw.visitMethod(ACC_STATIC + ACC_SYNTHETIC, "access$0", 
          "(Linject/PurchaseOrder;Linject/Customer;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "inject/PurchaseOrder",
          "customer", "Linject/Customer;");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_STATIC + ACC_SYNTHETIC, "access$1", 
          "(Linject/PurchaseOrder;)Linject/Customer;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "inject/PurchaseOrder", "
          customer", "Linject/Customer;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}