package employees;

import animals.interfaces.Feedable;
import java.util.ArrayList;
import java.util.List;

public class Feeder extends Employee {
    private List<Feedable> animals = new ArrayList<>();
    
    public Feeder(String name) {
        super(name, "Раздатчик корма");
    }
    
    public void addAnimal(Feedable animal) {
        animals.add(animal);
    }
    
    @Override
    public void work() {
        System.out.println(name + " кормит животных:");
        for (Feedable animal : animals) {
            animal.feed();
        }
    }
}
