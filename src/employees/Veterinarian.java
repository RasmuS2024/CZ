package employees;

import animals.interfaces.Treatable;
import java.util.ArrayList;
import java.util.List;

public class Veterinarian extends Employee {
    private List<Treatable> animals;  // СПИСОК животных
    
    public Veterinarian(String name) {
        super(name, "Ветеринар");
        this.animals = new ArrayList<>();
    }
    
    // Добавить животное для лечения
    public void addAnimal(Treatable animal) {
        animals.add(animal);
    }
    
    @Override
    public void work() {
        if (animals.isEmpty()) {
            System.out.println(name + " не назначены животные для лечения");
        } else {
            System.out.println(name + " лечит животных:");
            for (Treatable animal : animals) {
                animal.treat();
            }
        }
    }
    
    // Сколько животных у этого сотрудника
    public int getAnimalCount() {
        return animals.size();
    }
}