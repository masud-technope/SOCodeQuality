//Note this is intentially a simple algorithm, many faster options are out there
int findNearestIndex (point thisPoint, ArrayList listToSearch) {
    double nearestDistSquared=Double.POSITIVE_INFINITY;
    int nearestIndex;
    for (int i=0; i< listToSearch.size(); i++) {
        point point2=listToSearch.get(i);
        distsq = (thisPoint.x - point2.x)*(thisPoint.x - point2.x) 
               + (thisPoint.y - point2.y)*(thisPoint.y - point2.y);
        if(distsq < nearestDistSquared) {
            nearestDistSquared = distsq;
            nearestIndex=i;
        }
    }
    return nearestIndex;
}