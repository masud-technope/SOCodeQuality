List list; // from your method
for(Object x : list) {
    Class<?> clazz = x.getClass();
    Field field = clazz.getField("fieldName"); //Note, this can throw an exception if the field doesn't exist.
    Object fieldValue = field.get(x);
}