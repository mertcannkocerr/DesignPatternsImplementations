package IteratorPattern;

public class HandHeldInventoryIterator implements InventoryIterator{
    int index = 0;
    HandHeldInventory inventory;
    
    public HandHeldInventoryIterator(HandHeldInventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public boolean isDone() {
        return this.index > 1;
    }

    @Override
    public void next() {
        this.index += 1;
    }

    @Override
    public Item current() {
        switch (this.index) {
            case 0:
                return this.inventory.right;
            case 1:
                return this.inventory.left;
            default:
                return null;
        }
    }
}
