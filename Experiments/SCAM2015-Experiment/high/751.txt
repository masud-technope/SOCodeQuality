String prefix = "";
for (String serverId : serverIds) {
  sb.append(prefix);
  prefix = ",";
  sb.append(serverId);
}