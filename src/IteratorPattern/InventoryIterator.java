package IteratorPattern;

public interface InventoryIterator {
    boolean isDone();
    void next();
    Item current();
}
