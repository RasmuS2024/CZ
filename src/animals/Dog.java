package animals;

public class Dog extends Animal implements Soundable, Movable, Feedable {
    
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }
    
    @Override
    public void move() {
        System.out.println(getName() + " бегает");
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " ест кость");
    }
}
