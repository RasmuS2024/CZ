package accounting;

import java.util.ArrayList;
import java.util.List;

public class ExhibitionLog {
    private List<String> logs = new ArrayList<>();
    
    public void logExhibition(String name) {
        String log = String.format("Выставка '%s'", name);
        logs.add(log);
        System.out.println("Записана выставка: " + name);
    }
    
    public void showLogs() {
        System.out.println("\n=== ЖУРНАЛ ВЫСТАВОК ===");
        if (logs.isEmpty()) {
            System.out.println("Записей нет");
        } else {
            for (String log : logs) {
                System.out.println(log);
            }
        }
        System.out.println("=======================");
    }
    
}