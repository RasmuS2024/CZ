package animals;

import animals.interfaces.Feedable;
import animals.interfaces.Treatable;

public class Snake extends Animal implements Feedable, Treatable {
    public Snake(String name) {
        super(name, "Змея");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " шипит: Ш-ш-ш-ш!");
    }
    
    @Override
    public void feed() {
        System.out.println("Кормим змею " + name + " грызунами");
    }
    
    @Override
    public String getFoodType() {
        return "Грызуны";
    }
    
    @Override
    public void treat() {
        System.out.println("Лечим змею " + name);
    }
}
