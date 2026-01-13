package animals;

import animals.interfaces.Feedable;
import animals.interfaces.MedicalCheckup;
import animals.interfaces.Cleanable;

public class Parrot extends Animal implements Feedable, MedicalCheckup, Cleanable {
    public Parrot(String name) {
        super(name, "Попугай");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " говорит");
    }
    
    @Override
    public void feed() {
        System.out.println("Кормим попугая " + name + " зернами");
    }
    
    @Override
    public String getFoodType() {
        return "Зерна (8:00, 12:00, 17:00)";
    }
    
    @Override
    public void checkup() {
        System.out.println("Медосмотр попугая " + name);
    }
    
    @Override
    public void clean() {
        System.out.println("Чистим клетку попугая " + name);
    }
}
