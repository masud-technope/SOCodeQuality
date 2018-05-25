private static boolean isInSameHierarchy(List list) {
    Class<?> clazz = null;
    for (Object obj : list) {
      if (clazz == null) {
        clazz = obj.getClass();
      } else {
        if (clazz.isAssignableFrom(obj.getClass())) {
          continue;
        } else if (obj.getClass().isAssignableFrom(clazz)) {
          clazz = obj.getClass();
        } else {
          return false;
        }
      }
    }
    return true;
}