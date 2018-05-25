public int compare(Trial n1, Trial n2) {
    if(n1.c < n2.c)
        return 1;
    else if (n1.c > n2.c)
        return -1;
    return 0;
}