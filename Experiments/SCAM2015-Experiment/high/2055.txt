static void toBinary(int a){
    if(a!=0) {
        toBinary(a/2);
        System.out.print(a%2);
    }
}