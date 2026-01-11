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
    
    public String getName() { return name; }
    public String getType() { return type; }
}
