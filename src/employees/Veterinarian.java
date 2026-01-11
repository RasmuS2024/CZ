package employees;

import animals.interfaces.MedicalCheckup;

public class Veterinarian extends Employee {
    
    public Veterinarian(String name, int id) {
        super(name, id, "Ветеринар");
    }
    
    public void performCheckup(MedicalCheckup animal) {
        System.out.println(getName() + " проводит медосмотр");
        animal.performCheckup();
    }
}