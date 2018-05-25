@Override
public boolean equals (Object o) {
    if (!o instanceof Item) {
        return false;
    }
    Item other = (Item)o;
    return getId().equals(other.getId()) &&
           getTitle().equals(other.getTitle()) &&
           getDescription().equals(other.getDescription());
}