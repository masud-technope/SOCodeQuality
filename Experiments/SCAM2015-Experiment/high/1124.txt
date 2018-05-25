private Point[] boxPoints;

public void run() {
    init();
    placeGRects(boxPoints);
}

public void placeGRects(Point[] points) {
    for(int i=0;i<points.length;i++) {
        GRect b = new GRect(BOX_WIDTH,BOX_HEIGHT); 
        add(b);
        b.setLocation(points[i].x,points[i].y);
    }
}