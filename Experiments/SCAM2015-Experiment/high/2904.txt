int previous = 6;
int current = 0;
for(int i=position;i<ar.length;i++){
    current = ar[i];
    ar[i] = previous;
    previous = current;
}