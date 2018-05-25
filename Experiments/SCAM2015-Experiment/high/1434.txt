public class SkeletonBuilder
{
    private int x, y, width, height...;        
    public SkeletonBuilder withCoords(int x, int y) { this.x = x; this.y = y; }
    public SkeletonBuilder withSize(int width, int height) { this.width = width; this.height = height; }
    ...

    public Skeleton build() { return new Skeleton(x, y, width, height); }
}

public class Skeleton
{
    /* package */ Skeleton(int x, int y, int width, int height, ...)
}

// game code

Skeleton skeleton = new SkeletonBuilder().withCoords(1, 4).withSize(2, 30).build();