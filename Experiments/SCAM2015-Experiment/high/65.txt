function Max(data, size) {
    assert(size > 0)
    if (size == 1) {
        return data[0]
    }
    maxtail = Max(data[1..size], size-1)
    if (data[0] > maxtail) {
        return data[0]
    } else {
        return maxtail
    }
}