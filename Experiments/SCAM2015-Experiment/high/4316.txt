/**
     * @param <T> The type associated with this key
     * @param <K> The actual type of the key itself
     */
    public class TypedKey<T, K> {
        private final Class<T> type ;
        private final K key ;

        public TypedKey(Class<T> type, K key) {
            if (type == null || key == null) {
                throw new NullPointerException("type and key must be non-null");
            }
            this.type = type ;
            this.key = key ;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) return false ;
            if (! (o instanceof TypedKey)) {
                return false ;
            }
            TypedKey<?, ?> other = (TypedKey<?, ?>) o ;
            return other.type.equals(type) && other.key.equals(key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(type, key);
        }
    }