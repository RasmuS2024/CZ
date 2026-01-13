import animals.Lion;
import animals.Parrot;
import animals.Snake;
import employees.Feeder;
import employees.Veterinarian;
import employees.Cleaner;
import zoo.ZooSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ERP СИСТЕМА ЗООПАРКА ===\n");
        
        Lion lion = new Lion("Симба");
        Parrot parrot = new Parrot("Кеша");
        Parrot parrot2 = new Parrot("Ариша");
        Snake snake = new Snake("Зоя");
        
        Feeder feeder = new Feeder("Иван");
        Veterinarian vet = new Veterinarian("Мария Ивановна");
        Cleaner cleaner = new Cleaner("Петр");
        
        feeder.addAnimal(lion);
        feeder.addAnimal(parrot);
        feeder.addAnimal(parrot2);
        feeder.addAnimal(snake);
        
        vet.addAnimal(lion);
        vet.addAnimal(parrot);
        vet.addAnimal(parrot2);
        vet.addAnimal(snake);
        
        cleaner.addAnimal(lion);
        cleaner.addAnimal(parrot);
        cleaner.addAnimal(parrot2);
        
        ZooSystem zoo = new ZooSystem();
        
        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(parrot2);
        zoo.addAnimal(snake);
        
        zoo.addEmployee(feeder);
        zoo.addEmployee(vet);
        zoo.addEmployee(cleaner);
        
        zoo.addEnclosure("Вольер для львов");
        zoo.addEnclosure("Вольер для птиц");
        zoo.addEnclosure("Террариум");
        
        zoo.performDailyRoutine();
        zoo.conductExhibition("Выставка");
        zoo.performDailyRoutine();
        zoo.generateReport();
    }
}
