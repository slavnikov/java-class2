package oop;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String color;
    
    public Car() {
        this(4, 4, "IDK", "IDK");
    }
    
    public Car(int doors, int wheels, String model, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.color = color;
    }
    
    public void setDoors(int doors) {
        this.doors = doors;
    }
    
    public int getDoors() {
        return this.doors;
    }
}
