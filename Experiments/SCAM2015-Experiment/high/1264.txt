if (!inventory.containsKey(item))
    throw new InventoryException("Can't remove something you don't have");

inventory.put(item, inventory.get(item) - 1);

if (inventory.get(item) == 0)
    inventory.remove(item);