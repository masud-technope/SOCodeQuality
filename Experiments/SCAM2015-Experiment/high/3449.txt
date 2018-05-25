@Override
    public Spliterator<T> trySplit() {
        /*
         * Split into arrays of arithmetically increasing batch
         * sizes.  This will only improve parallel performance if
         * per-element Consumer actions are more costly than
         * transferring them into an array.  The use of an
         * arithmetic progression in split sizes provides overhead
         * vs parallelism bounds that do not particularly favor or
         * penalize cases of lightweight vs heavyweight element
         * operations, across combinations of #elements vs #cores,
         * whether or not either are known.  We generate
         * O(sqrt(#elements)) splits, allowing O(sqrt(#cores))
         * potential speedup.
         */
        Iterator<? extends T> i;
        long s;
        if ((i = it) == null) {
            i = it = collection.iterator();
            s = est = (long) collection.size();
        }
        else
            s = est;
        if (s > 1 && i.hasNext()) {
            int n = batch + BATCH_UNIT;
            if (n > s)
                n = (int) s;
            if (n > MAX_BATCH)
                n = MAX_BATCH;
            Object[] a = new Object[n];
            int j = 0;
            do { a[j] = i.next(); } while (++j < n && i.hasNext());
            batch = j;
            if (est != Long.MAX_VALUE)
                est -= j;
            return new ArraySpliterator<>(a, 0, j, characteristics);
        }
        return null;
    }