public float getAngle(Point target) {
    float angle = (float) Math.toDegrees(Math.atan2(target.y - y, target.x - x));

    if(angle < 0){
        angle += 360;
    }

    return angle;
}