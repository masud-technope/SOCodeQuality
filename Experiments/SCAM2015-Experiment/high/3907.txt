public static boolean isValidEmail(String email)
{
    if (email != null)
    {
        Pattern p = Pattern.compile("^[A-Za-z].*?@gmail\\.com$");
        Matcher m = p.matcher(email);
        return m.find();
    }
    return false;
}