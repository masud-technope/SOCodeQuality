public static void main(String args[]) {    
    if(!new Object() {
        public boolean foo() {
            System.out.print("Hello ");
            return true;
        }
    }.foo()){
        System.out.println("Hello");
    }else{
        System.out.println("World");
    }
}