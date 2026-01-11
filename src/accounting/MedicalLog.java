package accounting;

import java.util.ArrayList;
import java.util.List;

public class MedicalLog {
    private List<String> logs = new ArrayList<>();
    
    public void logCheckup(String animalName, String vet, String result) {
        String log = String.format("%s: %s осмотрел %s - %s", 
            new java.util.Date(), vet, animalName, result);
        logs.add(log);
        System.out.println("Записан медосмотр: " + animalName);
    }
    
    public void showLogs() {
        System.out.println("\n=== ЖУРНАЛ МЕДИЦИНСКИХ ОСМОТРОВ===");
        if (logs.isEmpty()) {
            System.out.println("Записей нет");
        } else {
            for (String log : logs) {
                System.out.println(log);
            }
        }
        System.out.println("==================================");
    }
    
    public String getLastCheckup(String animalName) {
        for (int i = logs.size() - 1; i >= 0; i--) {
            if (logs.get(i).contains(animalName)) {
                return logs.get(i);
            }
        }
        return "Осмотров не было";
    }
}
