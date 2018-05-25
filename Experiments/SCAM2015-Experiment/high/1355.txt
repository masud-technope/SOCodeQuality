byte[] input = /* whatever */;
int i = input.length;
while (i-- > 0 && input[i] == 32) {}

byte[] output = new byte[i+1];
System.arraycopy(input, 0, output, 0, i+1);