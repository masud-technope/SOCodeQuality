public void doXxx(Foo foo) {
    //...
    for(int i = 0; i<width; i++){
        for(int j = 0; j<width; j++){
            // changing code block
            //solved using interfaces
            foo.doFoo(i, j);
        }
    }
    //...
}