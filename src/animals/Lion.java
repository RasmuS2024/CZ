package animals;

import animals.interfaces.Feedable;
import animals.interfaces.MedicalCheckup;
import animals.interfaces.Cleanable;

public class Lion extends Animal implements Feedable, MedicalCheckup, Cleanable {
    public Lion(String name) {
        super(name, "Лев");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " рычит");
    }
    
    @Override
    public void feed() {
        System.out.println("Кормим льва " + name + " мясом");
    }
    
    @Override
    public String getFoodType() {
        return "Мясо (9:00, 18:00)";
    }
    
    @Override
    public void checkup() {
        System.out.println("Медосмотр льва " + name);
    }
    
    @Override
    public void clean() {
        System.out.println("Убираем вольер льва " + name);
    }
}
