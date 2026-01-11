package zoo;

import animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private String name;
    private String type;
    private List<Animal> animals;
    
    public Enclosure(String name, String type) {
        this.name = name;
        this.type = type;
        this.animals = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " добавлен в " + name);
    }
    
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
    
    public List<Animal> getAnimals() {
        return animals;
    }

    public void showInfo() {
        System.out.println("\nИнформация о вольере:");
        System.out.println("Название: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Количество животных: " + animals.size());
        
        if (!animals.isEmpty()) {
            System.out.println("Животные в вольере:");
            for (Animal animal : animals) {
                System.out.println("  - " + animal.getName() + 
                                 " (" + animal.getSpecies() + 
                                 ", возраст: " + animal.getAge() + " лет)");
            }
        } else {
            System.out.println("Вольер пуст");
        }
        System.out.println("---");
    }
    
    public String getName() { return name; }
    public String getType() { return type; }
}
