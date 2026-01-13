package employees;

import animals.interfaces.Cleanable;
import java.util.ArrayList;
import java.util.List;

public class Cleaner extends Employee {
    private List<Cleanable> animals = new ArrayList<>();
    
    public Cleaner(String name) {
        super(name, "Уборщик");
    }
    
    public void addAnimal(Cleanable animal) {
        animals.add(animal);
    }
    
    @Override
    public void work() {
        System.out.println(name + " убирает за животными:");
        for (Cleanable animal : animals) {
            animal.clean();
        }
    }
}
