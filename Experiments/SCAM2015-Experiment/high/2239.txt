public void setId(long id)  {
         this.id = this.id == null ? id : throw_();
     }

     public int throw_() {
         throw new RuntimeException("id is already set");
     }