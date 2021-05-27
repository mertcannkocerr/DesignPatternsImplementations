package IteratorPattern;

public class Item {
    public String name;
    public float damage;

    public Item(String name, float damage){
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString(){
        return this.name + ": "+ this.damage;
    }

}
