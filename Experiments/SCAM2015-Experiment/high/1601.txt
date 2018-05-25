void reverse_string(char* str, int left, int right) {
  char* p1 = str + left;
  char* p2 = str + right;
  while (p1 < p2) {
    char temp = *p1;
    *p1 = *p2;
    *p2 = temp;
    p1++;
    p2--;
  }
}

void rotate(char* str, int k) {
  int n = strlen(str);
  reverse_string(str, 0, n-1);
  reverse_string(str, 0, k-1);
  reverse_string(str, k, n-1);
}