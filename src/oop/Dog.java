package oop;

public class Dog extends Animal {
    
    private String coat;
    
    public Dog(String name, int weight, char size, String coat) {
        super(name, weight, size);
        this.coat = coat;
    }
    
    @Override
    public void eat() {
        System.out.println(this.getName() + " is chewing.");
        super.eat();
    }
}
