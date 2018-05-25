class MyDataClass {
    String name;
    String age;

    @Override
    public int hashCode() {
        return name.hashCode() ^ age.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyDataClass))
            return false;

        MyDataClass mdc = (MyDataClass) obj;
        return mdc.name.equals(name) && mdc.age.equals(age);
    }
}