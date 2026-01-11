package employees;

import animals.interfaces.Feedable;

public class Feeder extends Employee {
    
    public Feeder(String name, int id) {
        super(name, id, "Кормилец");
    }
    
    public void feedAnimal(Feedable animal) {
        System.out.println(getName() + " кормит животное");
        animal.eat();
    }
}
