package zoo;

import accounting.FeedingLog;
import accounting.MedicalLog;
import accounting.ExhibitionLog;
import java.util.ArrayList;
import java.util.List;

public class ZooERP {

    private List<animals.Animal> animals = new ArrayList<>();
    private List<employees.Employee> employees = new ArrayList<>();

    public FeedingLog feedingLog = new FeedingLog();
    public MedicalLog medicalLog = new MedicalLog();
    public ExhibitionLog exhibitionLog = new ExhibitionLog();

    public void addAnimal(animals.Animal animal) {
        animals.add(animal);
        System.out.println("Добавлено животное: " + animal.getName());
    }
    
    public void addEmployee(employees.Employee employee) {
        employees.add(employee);
        System.out.println("Добавлен сотрудник: " + employee.getName());
    }
    
    public void feedAnimals() {
        System.out.println("\nКОРМЛЕНИЕ ЖИВОТНЫХ");
        for (animals.Animal animal : animals) {
            if (animal instanceof animals.interfaces.Feedable) {
                ((animals.interfaces.Feedable) animal).eat();
                feedingLog.logFeeding(animal.getName(), 
                    ((animals.interfaces.Feedable) animal).getFavoriteFood(), 
                    "Сотрудник");
            }
        }
    }
    
    public void checkAnimals() {
        System.out.println("\nМЕДОСМОТР ЖИВОТНЫХ");
        for (animals.Animal animal : animals) {
            if (animal instanceof animals.interfaces.Treatable) {
                ((animals.interfaces.Treatable) animal).performCheckup();
                medicalLog.logCheckup(animal.getName(), 
                    "Ветеринар", "Здоров");
            }
        }
    }
    
    public void makeExhibition(String name) {
        System.out.println("\nВЫСТАВКА: " + name);
        
        for (animals.Animal animal : animals) {
            animal.makeSound();
        }
        
        exhibitionLog.logExhibition(name);
    }
    
    public void showAllReports() {
        System.out.println("\nОТЧЕТЫ ЗООПАРКА");
        System.out.println("Всего животных: " + animals.size());
        System.out.println("Всего сотрудников: " + employees.size());
        
        feedingLog.showLogs();
        medicalLog.showLogs();
        exhibitionLog.showLogs();
    }
}