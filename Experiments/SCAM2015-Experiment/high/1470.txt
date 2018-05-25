class ContactItem {
    private String name;
    private String tnumber;  //this can also be a data structure 
                             //for storing multiple numbers

    ContactItem( String name, String tnumber) {
        this.name = name;
        this.tnumber = tnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }        
}