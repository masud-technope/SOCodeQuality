public class ImageComparator implements Comparator<Obj> {
    @Override
    public int compare(Obj o1, Obj o2) {
        return Integer.compare(o1.Id, o2.Id);
    }
}