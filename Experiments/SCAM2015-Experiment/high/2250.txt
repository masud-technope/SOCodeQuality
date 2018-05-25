FieldType expectedType = Enum.valueOf(type.toUpperCase());

for (Field f: board.fieldlist) {
    if (field.getType() != expectedType)
        continue;
    if (!f.getOwnedBy().equals(owner))
        continue;
    // Correct type, owned by the correct guy:
    // check that we must update; if so, update
    if (expectedType.mustUpdateCount())
        count++;
}