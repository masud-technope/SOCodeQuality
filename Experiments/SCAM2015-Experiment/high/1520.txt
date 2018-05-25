StringBuilder sb = new StringBuilder(some_appropriate_size);
sb.append("select id1, ");
sb.append(id2);
sb.append(" from ");
sb.append(table);
return sb.toString();