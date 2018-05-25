Collection<?> coll = ...
if (coll.isEmpty())
    throw new BadLuckException();
Object representative = coll.iterator().next();
Class<?> typeOfContent = representative.getClass();
//apply your cases on this Class object