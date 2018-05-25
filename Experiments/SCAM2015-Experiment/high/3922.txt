@Override
public boolean equals(Object other) {
   if(other == null) return false;
   if(!(other instanceof CoordPoint)) return false;
   CoordPoint otherPoint = (CoordPoint) other;
   return (this.X == otherPoint.X) && (this.Y == otherPoint.Y);
}