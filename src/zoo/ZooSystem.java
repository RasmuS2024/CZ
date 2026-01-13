package zoo;

import animals.Animal;
import employees.Employee;
import java.util.ArrayList;
import java.util.List;

public class ZooSystem {
    private List<Animal> animals = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<String> enclosures = new ArrayList<>();
    
    private int feedingCount = 0;
    private int medicalCount = 0;
    private int cleaningCount = 0;
    private int exhibitionCount = 0;
    
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Добавлено животное: " + animal.getName());
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Добавлен сотрудник: " + employee.getName());
    }
    
    public void addEnclosure(String enclosure) {
        enclosures.add(enclosure);
        System.out.println("Добавлен вольер: " + enclosure);
    }
    
    public void performDailyRoutine() {
        System.out.println("\n=== ЕЖЕДНЕВНЫЕ ПРОЦЕДУРЫ ===");
        
        for (Employee employee : employees) {
            employee.work();
            
            if (employee instanceof employees.Feeder) {
                feedingCount++;
            } else if (employee instanceof employees.Veterinarian) {
                medicalCount++;
            } else if (employee instanceof employees.Cleaner) {
                cleaningCount++;
            }
        }
    }
    
    public void conductExhibition(String name) {
        System.out.println("\n=== ВЫСТАВКА: " + name + " ===");
        
        for (Animal animal : animals) {
            animal.makeSound();
        }
        
        exhibitionCount++;
        System.out.println("Выставка завершена");
    }
    
    public void generateReport() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("ОТЧЕТ ЗООПАРКА");
        System.out.println("=".repeat(40));
        
        System.out.println("\nОБЩАЯ ИНФОРМАЦИЯ:");
        System.out.println("Животных: " + animals.size());
        System.out.println("Сотрудников: " + employees.size());
        System.out.println("Вольеров: " + enclosures.size());
        
        System.out.println("\nСПИСОК ЖИВОТНЫХ:");
        for (Animal animal : animals) {
            System.out.println("- " + animal.getName() + " (" + animal.getSpecies() + ")");
        }
        
        System.out.println("\nСПИСОК СОТРУДНИКОВ:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (" + employee.getPosition() + ")");
        }
        
        System.out.println("\nУЧЕТ ОПЕРАЦИЙ:");
        System.out.println("Кормлений: " + feedingCount);
        System.out.println("Медосмотров: " + medicalCount);
        System.out.println("Уборок: " + cleaningCount);
        System.out.println("Выставок: " + exhibitionCount);
        
        System.out.println("\n" + "=".repeat(40));
    }
    
    public List<Animal> getAnimals() { 
        return new ArrayList<>(animals); 
    }
}