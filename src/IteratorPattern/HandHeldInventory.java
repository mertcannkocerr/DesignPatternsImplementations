package IteratorPattern;

public class HandHeldInventory implements Inventory{
    public Item right;
    public Item left;

    public HandHeldInventory(Item right, Item left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public InventoryIterator getIterator() {
        return new HandHeldInventoryIterator(this);
    }
}
