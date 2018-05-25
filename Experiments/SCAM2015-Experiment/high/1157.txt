public String dist; //value is actually Long
public int compareTo(Tree o) {
    if(this.dist.length()!=o.dist.length())
          return this.dist.length()<o.dist.length()?-1:1;//assume the shorter string is a smaller value
    else return this.dist.compareTo(o.dist);
}