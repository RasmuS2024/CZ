package employees;

import animals.interfaces.Feedable;

public class Feeder extends Employee {
    public void feedAnimal(Feedable animal) {
        System.out.println("Сотрудник " + getName() + " кормит животное.");
        animal.eat();
    }
}
