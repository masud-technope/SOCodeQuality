String line = null;
StringBuilder json = new StringBuilder();
while((line = input.readLine()) !=null)
{
    json.append(line);
}
value = json.substring(3); // removes the leading "// "