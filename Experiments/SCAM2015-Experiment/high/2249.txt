enum FieldType {
    SHIPPING(true),
    BREWERY(true),
    NOTME(false);

    private final boolean countUpdate;

    FieldType(boolean countUpdate) { this.countUpdate = countUpdate; }
    public boolean mustUpdateCount() { return countUpdate; }
};

abstract class Field {
    protected final FieldType type;
    protected Field(FieldType type) { this.type = type; }
    public final FieldType getType() { return type; }
    public final boolean mustUpdateCount() { return type.mustUpdateCount(); }
}

class Brewery implements Field {
    Brewery() {
        super(BREWERY);
    }
}