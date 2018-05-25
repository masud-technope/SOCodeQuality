String response = "[-47, 1, 16, 84, 2, 101, 110, 83, 111, 109, 101, 32, 78, 70, 67, 32, 68, 97, 116, 97]";      // response from the Python script

String[] byteValues = response.substring(1, response.length() - 1).split(",");
byte[] bytes = new byte[byteValues.length];

for (int i=0, len=bytes.length; i<len; i++) {
   bytes[i] = Byte.parseByte(byteValues[i].trim());     
}

String str = new String(bytes);