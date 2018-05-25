CoordPoint curPosition = new CoordPoint(5, 5);
CoordPoint destination = new CoordPoint(5, 5);

if(curPosition.equals(destination)) {
    /* This won't be executed, since even though the objects have the same member
     * values, the two references aren't pointing to the same object.
     */
}

CoordPoint anotherOne = curPosition;

if(curPosition.equals(anotherOne)) {
    // This will be executed, since the two references point to the same object.
}