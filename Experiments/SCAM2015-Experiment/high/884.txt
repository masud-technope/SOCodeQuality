BasicDBObject query = new BasicDBObject();
BasicDBObject field = new BasicDBObject();
field.put("HomeTown", 1);
DBCursor cursor = db.getCollection(collectionName).find(query,field);
while (cursor.hasNext()) {
    BasicDBObject obj = (BasicDBObject) cursor.next();
    result.add(obj.getString("HomeTown"));
}