import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class TypedPropertyMapTest {

    public static void main(String[] args) {
        TypedPropertyMap<String> map1 = new TypedPropertyMap<>();
        TypedPropertyMap<String> map2 = new TypedPropertyMap<>();

        TypedKey<Number, String> key1 = new TypedKey<>(Number.class, "key1");
        TypedKey<String, String> key2 = new TypedKey<>(String.class, "key2");

        map1.put(key1, new SimpleIntegerProperty(5));
        map1.put(key2, new SimpleStringProperty("hi"));

        map2.put(key1, new SimpleIntegerProperty());
        map2.put(key2, new SimpleStringProperty());

        map2.get(key1).setValue(map1.get(key1).getValue());
        map2.get(key2).setValue(map1.get(key2).getValue());

        System.out.println(map2.get(key1).getValue());
        System.out.println(map2.get(key2).getValue());

    }


    /**
     * @param <T> The type associated with this key
     * @param <K> The actual type of the key itself
     */
    public static class TypedKey<T, K> {
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

    /**
     * @param <K> The type of the key in the TypedKey
     */
    public static class TypedPropertyMap<K> { 
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
}