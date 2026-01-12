package animals;

import animals.interfaces.Feedable;
import animals.interfaces.Cleanable;
import animals.interfaces.Treatable;

public class Parrot extends Animal implements Feedable, Cleanable, Treatable {
    public Parrot(String name) {
        super(name, "Попугай");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Привет!");
    }
    
    @Override
    public void feed() {
        System.out.println("Кормим попугая " + name + " зернами");
    }
    
    @Override
    public String getFoodType() {
        return "Зерна";
    }
    
    @Override
    public void clean() {
        System.out.println("Чистим клетку попугая " + name);
    }
    
    @Override
    public void treat() {
        System.out.println("Лечим попугая " + name);
    }
}
