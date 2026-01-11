package animals;

public class Panda extends Animal implements Soundable, Movable, Feedable {
    
    public Panda(String name, int age, String color) {
        super(name, age, color);
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Ы-ы-ы! (звуки панды)");
    }
    
    @Override
    public void move() {
        System.out.println(getName() + " неуклюже карабкается");
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " ест бамбук");
    }
    
    public void climbTree() {
        System.out.println(getName() + " лазает по деревьям, несмотря на размер");
    }
}
