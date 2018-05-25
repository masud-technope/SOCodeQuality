public class Tree implements Comparable<Tree> {
    public long dist; //value is actually Long

    public int compareTo(Tree o) {
        return this.dist<o.dist?-1:
               this.dist>o.dist?1:0;
    }
}