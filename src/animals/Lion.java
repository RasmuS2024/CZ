package animals;

import animals.interfaces.Feedable;
import animals.interfaces.Cleanable;
import animals.interfaces.Treatable;

public class Lion extends Animal implements Feedable, Cleanable, Treatable {
    public Lion(String name) {
        super(name, "Лев");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " рычит: Р-р-р-р!");
    }
    
    @Override
    public void feed() {
        System.out.println("Кормим льва " + name + " мясом");
    }
    
    @Override
    public String getFoodType() {
        return "Мясо";
    }
    
    @Override
    public void clean() {
        System.out.println("Убираем вольер льва " + name);
    }
    
    @Override
    public void treat() {
        System.out.println("Лечим льва " + name);
    }
}
