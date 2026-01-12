package zoo;

import animals.Animal;
import employees.Employee;
import java.util.ArrayList;
import java.util.List;

// SRP (Single Responsibility Principle) - управление животными и сотрудниками
public class ZooERP {
    private List<Animal> animals = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Добавлено животное: " + animal);
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Добавлен сотрудник: " + employee.getName() + 
                          " (" + employee.getPosition() + ")");
    }
    
    public List<Animal> getAnimals() {
        return new ArrayList<>(animals); // возвращаем копию
    }
    
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees); // возвращаем копию
    }
    
    public void performDailyRoutine() {
        System.out.println("\n=== ЕЖЕДНЕВНЫЙ РЕЖИМ ===");
        for (Employee employee : employees) {
            employee.work();
        }
    }
}