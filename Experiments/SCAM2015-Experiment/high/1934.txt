@Override  
public void interrupt(){  
   try{  
      socket.close();  
   }  
   finally{  
     super.interrupt();  
   }  
}