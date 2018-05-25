public static void loadClass(Class<?> cls) throws IllegalArgumentException, IllegalAccessException, InstantiationException {          
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {      
                if (field.getType().isArray()) {
                    int length = Array.getLength(field.get(cls.newInstance()));
                    System.out.println(length);
                }
        }
    }