StringBuilder sb = new StringBuilder(128);
while (<some condition>) {
    sb.append(<something>)
      .append(<more>)
      ... ;
    // Append stringBufferVariable.toString() to a file;
    sb.setLength(0);
}