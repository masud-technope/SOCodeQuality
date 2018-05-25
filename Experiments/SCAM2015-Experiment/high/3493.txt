/**
 * Turns an Optional<T> into a Stream<T> of length zero or one depending upon
 * whether a value is present.
 */
static <T> Stream<T> streamopt(Optional<T> opt) {
    if (opt.isPresent())
        return Stream.of(opt.get());
    else
        return Stream.empty();
}

Optional<Other> result =
    things.stream()
          .flatMap(t -> streamopt(resolve(t)))
          .findFirst();