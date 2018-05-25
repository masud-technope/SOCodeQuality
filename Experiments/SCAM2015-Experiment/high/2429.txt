long a = 25214903917;   // These Values for a and c are the actual values found
long c = 11;            // in the implementation of java.util.Random(), see link
long previous = 0;

void rseed(long seed) {
    previous = seed;
}

long rand() {
    long r = a * previous + c;
    // Note: typically, one chooses only a couple of bits of this value, see link
    previous = r;
    return r;
}