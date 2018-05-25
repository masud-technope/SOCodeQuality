int fact(int x, int y) {
    if (y < x)
        return 0;

    return 1 + fact(x, y-x);
}