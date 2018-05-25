Iterator<Element> iterator = set.iterator();

if (!iterator.hasNext()) {
    throw new RuntimeException("Collection is empty");
}

Element element = iterator.next();

if (iterator.hasNext()) {
    throw new RuntimeException("Collection contains more than one item");
}

return element;