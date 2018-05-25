/**
     * @param <K> The type of the key in the TypedKey
     */
    public class TypedPropertyMap<K> { 
        private final Map<TypedKey<?, K>, Property<?>> map = new HashMap<>();

        public <T> void put(TypedKey<T, K> key, Property<T> property) {
            map.put(key, property);
        }

        @SuppressWarnings("unchecked")
        public <T> Property<T> get(TypedKey<T, K> key) {

            // by virtue of the API we defined, the property associated with
            // key must be a Property<T> (even though the underlying map does not know it):

            return (Property<T>) map.get(key);
        }
    }