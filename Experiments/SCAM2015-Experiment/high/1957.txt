static <T> boolean checkElementType(Collection<?> collection, Class<T> elementType) {
    for (Object object : collection) {
        if (!elementType.isAssignableFrom(object.getClass())) {
            return false;
        }
    }
    return true;
}