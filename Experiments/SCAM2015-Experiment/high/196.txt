try {
    isSuccess = insertUserData(st, blocks, db, actor);
    system.out.print("after insertUserData");
} catch (Exception e) {
    System.out.print("before throwing");
    throw new ImportException("Could not insert user on line " + rowCounter);
}