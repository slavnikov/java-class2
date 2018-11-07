package oop;

public class Animal {
    private String name;
    private int weight;
    private char size;
    
    public Animal(String name, int weight, char size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void eat() {
        System.out.println(this.name + " is eating.");
    }
}
