package animals.interfaces;

import java.util.Date;

public interface MedicalCheckup {
    void performCheckup();
    Date getLastCheckupDate();
    void setLastCheckupDate(Date date);
    boolean isVaccinated();
}
