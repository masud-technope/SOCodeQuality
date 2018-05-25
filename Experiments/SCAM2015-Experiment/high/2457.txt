boolean similarTo(Color c){
    double distance = (c.r - this.r)*(c.r - this.r) + (c.g - this.g)*(c.g - this.g) + (c.b - this.b)*(c.b - this.b)
    if(distance > X){
        return true;
    }else{
        return false;
    }
}