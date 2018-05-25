public String substituteStr (String template, Map<String,String> substs) {
    String result = template;
    for (Map.Entry<String,String> subst : substs.entrySet()) {
        String pattern = "{"+subst.getKey()+"}";
        result = result.replace( pattern, subst.getValue());
    }
    return result;
}