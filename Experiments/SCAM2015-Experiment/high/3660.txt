Long result = 0l;
for (int i = 0; i < cols; i++) {
     Long l = row[i].longValue() * column[i].longValue();
     result += l;
}
output.set(r, c, (T) result);