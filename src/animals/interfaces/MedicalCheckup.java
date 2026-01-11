package animals.interfaces;

import java.util.Date;

public interface MedicalCheckup {
    void performCheckup();
    Date getLastCheckupDate();
    boolean isVaccinated();
}
