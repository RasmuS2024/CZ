package animals;

public abstract class Animal {
    protected String name;
    protected String species;
    
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    
    public abstract void makeSound();
    
    public String getName() { return name; }
    public String getSpecies() { return species; }
}
