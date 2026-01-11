package accounting;

import java.util.ArrayList;
import java.util.List;

public class FeedingLog {
    private List<String> logs = new ArrayList<>();
    
    public void logFeeding(String animalName, String food, String feeder) {
        String log = String.format("%s: %s покормили %s", 
            new java.util.Date(), animalName, food);
        logs.add(log);
        System.out.println("Записано кормление: " + animalName);
    }
    
    public void showLogs() {
        System.out.println("\n=== ЖУРНАЛ КОРМЛЕНИЯ ===");
        if (logs.isEmpty()) {
            System.out.println("Записей нет");
        } else {
            for (String log : logs) {
                System.out.println(log);
            }
        }
        System.out.println("========================");
    }
    
    public int getTotalFeedings() {
        return logs.size();
    }
}
