@Override
public int hashCode() {
    final int prime = 31;
    result = prime * result + getId().hashCode();
    result = prime * result + getTitle().hashCode();
    result = prime * result + getDescription().hashCode();
    return result;
}