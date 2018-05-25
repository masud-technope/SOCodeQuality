Resource resource = acquire();
try {
    Decorator decorated = decorate(resource);
    use(decorated);
    decorated.flush();
} finally {
    resource.release();
}