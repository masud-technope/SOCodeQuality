public class TypedPropertyMap<K> implements Observable { 
        private final ObservableMap<TypedKey<?, K>, Property<?>> map = FXCollections.observableHashMap();

        @Override
        public void addListener(InvalidationListener listener) {
            map.addListener(listener);
        }

        @Override
        public void removeListener(InvalidationListener listener) {
            map.removeListener(listener);
        }

        // remaining code as before...
    }