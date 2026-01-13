package animals;

import animals.interfaces.Feedable;
import animals.interfaces.MedicalCheckup;

public class Snake extends Animal implements Feedable, MedicalCheckup {
    public Snake(String name) {
        super(name, "Змея");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " шипит");
    }
    
    @Override
    public void feed() {
        System.out.println("Кормим змею " + name + " грызунами");
    }
    
    @Override
    public String getFoodType() {
        return "Грызуны (раз в неделю)";
    }
    
    @Override
    public void checkup() {
        System.out.println("Медосмотр змеи " + name);
    }
}