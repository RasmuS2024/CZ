package employees;

import animals.interfaces.MedicalCheckup;
import java.util.ArrayList;
import java.util.List;

public class Veterinarian extends Employee {
    private List<MedicalCheckup> animals = new ArrayList<>();
    
    public Veterinarian(String name) {
        super(name, "Ветеринар");
    }
    
    public void addAnimal(MedicalCheckup animal) {
        animals.add(animal);
    }
    
    @Override
    public void work() {
        System.out.println(name + " осматривает животных:");
        for (MedicalCheckup animal : animals) {
            animal.checkup();
        }
    }
}
