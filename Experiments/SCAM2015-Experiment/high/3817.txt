if (a % 10 in [0, 1, 5, 6])
    return [a % 10: n]
else 
    if (a % 10 in [4, 9])
        c = n / 2
        r = n % 2
        counts = [a % 10: c, 10 - a % 10: c]
    else
        c = n / 4
        r = n % 4
        if (a % 2 == 0)
            counts = [2: c, 4: c, 6: c, 8: c]
        else
            counts = [1: c, 3: c, 7: c, 9: c]

    d = a % 10
    for i = 0; i < r; i++
        counts[d]++
        d = (d * a) % 10

    return counts