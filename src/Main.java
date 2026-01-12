import animals.*;
import employees.*;
import zoo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ ERP СИСТЕМЫ ЗООПАРКА ===\n");
        
        // 1. Создаем животных
        Lion lion = new Lion("Симба");
        Parrot parrot = new Parrot("Кеша");
        Snake snake = new Snake("Каа");
        
        // 2. Создаем сотрудников
        Feeder feeder = new Feeder("Иван");
        Veterinarian vet = new Veterinarian("Мария");
        
        // 3. Назначаем ВСЕХ животных сотрудникам
        // Feeder получает всех животных, которые умеют есть
        feeder.addAnimal(lion);    // Lion implements Feedable
        feeder.addAnimal(parrot);  // Parrot implements Feedable  
        feeder.addAnimal(snake);   // Snake implements Feedable
        
        // Veterinarian получает всех животных, которых можно лечить
        vet.addAnimal(lion);       // Lion implements Treatable
        vet.addAnimal(parrot);     // Parrot implements Treatable
        vet.addAnimal(snake);      // Snake implements Treatable
        
        System.out.println("Кормилец " + feeder.getName() + " отвечает за " + 
                          feeder.getAnimalCount() + " животных");
        System.out.println("Ветеринар " + vet.getName() + " отвечает за " + 
                          vet.getAnimalCount() + " животных");
        
        // 4. Создаем систему управления
        ZooERP zoo = new ZooERP();
        
        // 5. Добавляем животных и сотрудников
        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(snake);
        
        zoo.addEmployee(feeder);
        zoo.addEmployee(vet);
        
        // 6. Демонстрация работы сотрудников
        zoo.performDailyRoutine();
        
        // 7. Генерация отчета
        ReportModule report = new ReportModule();
        report.generateReport(zoo);
        
        // 8. Демонстрация добавления нового животного
        System.out.println("=== ДОБАВЛЕНИЕ НОВОГО ЖИВОТНОГО ===");
        Parrot newParrot = new Parrot("Гоша");
        zoo.addAnimal(newParrot);
        
        // Назначаем новое животное сотрудникам
        feeder.addAnimal(newParrot);
        vet.addAnimal(newParrot);
        
        System.out.println("Теперь кормилец отвечает за " + feeder.getAnimalCount() + " животных");
        
        // 9. Добавляем нового сотрудника
        System.out.println("\n=== ДОБАВЛЕНИЕ НОВОГО СОТРУДНИКА ===");
        Feeder newFeeder = new Feeder("Петр");
        
        // Разделяем обязанности: Петр кормит только змей
        newFeeder.addAnimal(snake);
        
        // Иван больше не кормит змей
        // (В реальной системе нужно добавить метод removeAnimal)
        
        zoo.addEmployee(newFeeder);
        
        // 10. Показываем обновленный отчет
        System.out.println("\n=== ОБНОВЛЕННЫЙ ОТЧЕТ ===");
        report.generateReport(zoo);
        
        // 11. Еще раз выполняем ежедневный режим
        System.out.println("\n=== ПОВТОРНЫЙ ЕЖЕДНЕВНЫЙ РЕЖИМ ===");
        zoo.performDailyRoutine();
        
        // 12. Демонстрация полиморфизма
        System.out.println("\n=== ГОЛОСА ЖИВОТНЫХ ===");
        Animal[] allAnimals = {lion, parrot, snake, newParrot};
        for (Animal animal : allAnimals) {
            animal.makeSound();
        }
        
        // 13. Демонстрация SOLID принципов
        System.out.println("\n=== ДЕМОНСТРАЦИЯ SOLID ПРИНЦИПОВ ===");
        
        // OCP: Можно добавить новое животное
        System.out.println("\n1. OCP - Open/Closed Principle:");
        System.out.println("   Можно добавить Tiger extends Animal без изменения кода Feeder, Veterinarian");
        
        // LSP: Можно подставлять разные типы
        System.out.println("\n2. LSP - Liskov Substitution Principle:");
        System.out.println("   Feedable feedable1 = new Lion(\"Лев\");");
        System.out.println("   Feedable feedable2 = new Parrot(\"Попугай\");");
        System.out.println("   Оба работают в одном списке Feedable");
        
        // ISP: Разделенные интерфейсы
        System.out.println("\n3. ISP - Interface Segregation Principle:");
        System.out.println("   Lion: Feedable, Cleanable, Treatable");
        System.out.println("   Snake: Feedable, Treatable (нет Cleanable)");
        System.out.println("   Feeder зависит только от Feedable");
        System.out.println("   Veterinarian зависит только от Treatable");
        
        // DIP: Зависимость от абстракций
        System.out.println("\n4. DIP - Dependency Inversion Principle:");
        System.out.println("   Feeder зависит от Feedable (абстракция)");
        System.out.println("   ZooERP зависит от Employee (абстракция)");
        System.out.println("   Не от конкретных Lion, Parrot, Snake");
        
        // SRP: Единственная ответственность
        System.out.println("\n5. SRP - Single Responsibility Principle:");
        System.out.println("   Feeder: только кормить");
        System.out.println("   Veterinarian: только лечить");
        System.out.println("   ReportModule: только отчеты");
        System.out.println("   ZooERP: только управление");
    }
}
