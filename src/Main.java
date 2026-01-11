import animals.Dog;
import animals.Panda;
import employees.Feeder;
import employees.Veterinarian;
import zoo.ZooERP;
import zoo.Enclosure;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ERP СИСТЕМА ЗООПАРКА ===\n");
        
        Dog dog = new Dog("Бобик", 3, "Собака");
        Panda panda = new Panda("Петяша", 2, "Панда");
        Dog dog2 = new Dog("Шарик", 5, "Собака");
        
        Feeder feeder = new Feeder("Иван Петров", 1);
        Veterinarian vet = new Veterinarian("Мария Иванова", 2);
        
        Enclosure dogEnclosure = new Enclosure("Вольер для собак", "Большой вольер");
        Enclosure pandaEnclosure = new Enclosure("Вольер для панд", "Большой открытый вольер");
        dogEnclosure.addAnimal(dog);
        dogEnclosure.addAnimal(dog2);
        pandaEnclosure.addAnimal(panda);
        System.out.println("\n=== ИНФОРМАЦИЯ О ВОЛЬЕРАХ ===");
        dogEnclosure.showInfo();
        pandaEnclosure.showInfo();

        ZooERP zoo = new ZooERP();
        
        zoo.addAnimal(dog);
        dog.makeSound();
        zoo.addAnimal(panda);
        panda.makeSound();
        zoo.addAnimal(dog2);
        dog2.makeSound();
        
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