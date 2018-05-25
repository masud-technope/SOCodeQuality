static <T extends Number> T newNumber1(Class<T> tClass, String s){
    if(tClass == Integer.class){
        return (T) Integer.valueOf(s);
    }
}

// OR

static Number newNumber2(Class<? extends Number> tClass, String s){
    if(tClass == Integer.class){
        return Integer.valueOf(s);
    }
}