public int compareTo(PopularSport other) {
    if (this.rank < other.rank) return -1;
    else if (this.rank > other.rank) return +1;
    else {
        // This is where the nesting happens to break the ties.
        if (this.sport.compareTo(other.sport) < 0) return -1;
        else if (this.sport.compareTo(other.sport) > 0) return +1;
        else return 0;  // You'll have deeper nesting for the other values in Medal.
    }
}