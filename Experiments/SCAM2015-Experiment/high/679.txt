int source = arr.Length - 1;
int dest = arr.Length - 1;
while (source >= 0) {
  if (arr[source] != 0) {
    arr[dest--] = arr[source];
  }
  source--;
}
while (dest >= 0) arr[dest--] = 0;