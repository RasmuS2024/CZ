package employees;

import animals.interfaces.Feedable;

public class Feeder extends Employee {
    private Feedable animal;
    
    public Feeder(String name) {
        super(name, "Кормилец");
    }
    
    public void setAnimal(Feedable animal) {
        this.animal = animal;
    }
    
    @Override
    public void work() {
        if (animal != null) {
            System.out.println(name + " кормит животное");
            animal.feed();
        } else {
            System.out.println(name + " не назначено животное для кормления");
        }
    }
}