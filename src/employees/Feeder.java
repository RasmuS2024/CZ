package employees;

import animals.interfaces.Feedable;
import java.util.ArrayList;
import java.util.List;

public class Feeder extends Employee {
    private List<Feedable> animals;  // СПИСОК животных
    
    public Feeder(String name) {
        super(name, "Кормилец");
        this.animals = new ArrayList<>();
    }
    
    // Добавить животное для кормления
    public void addAnimal(Feedable animal) {
        animals.add(animal);
    }
    
    @Override
    public void work() {
        if (animals.isEmpty()) {
            System.out.println(name + " не назначены животные для кормления");
        } else {
            System.out.println(name + " кормит животных:");
            for (Feedable animal : animals) {
                animal.feed();
            }
        }
    }
    
    // Сколько животных у этого сотрудника
    public int getAnimalCount() {
        return animals.size();
    }
}
