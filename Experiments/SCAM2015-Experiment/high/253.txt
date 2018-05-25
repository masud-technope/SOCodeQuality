public boolean isAbsolute(File f) 
{
        int pl = f.getPrefixLength();
        return (((pl == 2) && (f.getPath().charAt(0) == slash))
                || (pl == 3));
}