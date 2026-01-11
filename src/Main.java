import animals.Dog;
import animals.Panda;
import employees.Feeder;
import employees.Veterinarian;
import zoo.ZooERP;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ERP СИСТЕМА ЗООПАРКА ===\n");
        
        Dog dog = new Dog("Бобик", 3, "Собака");
        dog.makeSound();
        Panda panda = new Panda("Петяша", 2, "Панда");
        panda.makeSound();
        Dog dog2 = new Dog("Шарик", 5, "Собака");
        dog2.makeSound();
        
        Feeder feeder = new Feeder("Иван Петров", 1);
        Veterinarian vet = new Veterinarian("Мария Иванова", 2);
        
        ZooERP zoo = new ZooERP();
        
        zoo.addAnimal(dog);
        zoo.addAnimal(panda);
        zoo.addAnimal(dog2);
        
        zoo.addEmployee(feeder);
        zoo.addEmployee(vet);
        
        zoo.feedAnimals();
        zoo.checkAnimals();
        
        zoo.makeExhibition("День животных");
        zoo.makeExhibition("Парад животных");
        
        zoo.showAllReports();
        
        System.out.println("\n=== ДОПОЛНИТЕЛЬНО ===");
        System.out.println("Всего кормлений: " + zoo.feedingLog.getTotalFeedings());
        System.out.println("Последний осмотр Бобика: " + zoo.medicalLog.getLastCheckup("Бобик"));
        
    }
}