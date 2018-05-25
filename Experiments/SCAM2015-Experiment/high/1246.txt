class MyDataClassDecorator {

    MyDataClass mdc;

    public MyDataClassDecorator(MyDataClass mdc) {
        this.mdc = mdc;
    }

    @Override
    public int hashCode() {
        return mdc.name.hashCode() ^ mdc.age.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyDataClassDecorator))
            return false;

        MyDataClassDecorator mdcd = (MyDataClassDecorator) obj;
        return mdcd.mdc.name.equals(mdc.name) && mdcd.mdc.age.equals(mdc.age);
    }
}