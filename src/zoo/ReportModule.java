package zoo;

import animals.Animal;
import animals.interfaces.*;
import employees.Employee;
import employees.Feeder;
import employees.Veterinarian;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReportModule {
    
    public void generateReport(ZooERP zoo) {
        System.out.println("\n=== ОТЧЕТ ЗООПАРКА ===");
        
        List<Animal> animals = zoo.getAnimals();
        List<Employee> employees = zoo.getEmployees();
        
        // Общая информация
        System.out.println("Всего животных: " + animals.size());
        System.out.println("Всего сотрудников: " + employees.size());
        
        // Статистика по видам животных
        Map<String, Long> speciesCount = animals.stream()
            .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()));
        
        System.out.println("\nРаспределение по видам:");
        speciesCount.forEach((species, count) -> 
            System.out.println("  " + species + ": " + count));
        
        // Информация о кормлении
        System.out.println("\nРасписание кормления:");
        for (Animal animal : animals) {
            if (animal instanceof Feedable) {
                System.out.println("  " + animal.getName() + " (" + animal.getSpecies() + 
                                 "): " + ((Feedable) animal).getFoodType());
            }
        }
        
        // Информация о сотрудниках
        System.out.println("\nСотрудники и их обязанности:");
        for (Employee employee : employees) {
            System.out.print("  " + employee.getName() + " - " + employee.getPosition());
            
            if (employee instanceof Feeder) {
                System.out.println(" (кормит " + ((Feeder) employee).getAnimalCount() + " животных)");
            } else if (employee instanceof Veterinarian) {
                System.out.println(" (лечит " + ((Veterinarian) employee).getAnimalCount() + " животных)");
            } else {
                System.out.println();
            }
        }
        
        // Кто какие интерфейсы реализует (для демонстрации ISP)
        System.out.println("\nСводка по возможностям животных:");
        for (Animal animal : animals) {
            StringBuilder abilities = new StringBuilder();
            
            if (animal instanceof Feedable) abilities.append("Есть, ");
            if (animal instanceof animals.interfaces.Cleanable) abilities.append("Чистить, ");
            if (animal instanceof animals.interfaces.Treatable) abilities.append("Лечить, ");
            
            if (abilities.length() > 0) {
                abilities.setLength(abilities.length() - 2); // убираем последнюю запятую
            }
            
            System.out.println("  " + animal.getName() + ": " + abilities);
        }
        
        System.out.println("======================\n");
    }
}