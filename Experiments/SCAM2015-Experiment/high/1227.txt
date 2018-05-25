ByteArrayOutputStream stream = new ByteArrayOutputStream();
ObjectOutputStream out = new ObjectOutputStream(stream);
out.writeObject(list);
stream.close();
// save stream.toByteArray() to db

// read byte
ByteArrayInputStream bytes = ...
ObjectInputStream in = new ObjectInputStream(bytes);
List<String> list = in.readObject();