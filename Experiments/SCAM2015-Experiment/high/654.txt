HttpResponse response; // some response object
BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
StringBuilder builder = new StringBuilder();
for (String line = null; (line = reader.readLine()) != null;) {
    builder.append(line).append("\n");
}
JSONTokener tokener = new JSONTokener(builder.toString());
JSONArray finalResult = new JSONArray(tokener);