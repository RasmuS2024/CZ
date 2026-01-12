package employees;

import animals.interfaces.Treatable;

public class Veterinarian extends Employee {
    
    public Veterinarian(String name, int id) {
        super(name, id, "Ветеринар");
    }
    
    public void performCheckup(Treatable animal) {
        System.out.println(getName() + " проводит медосмотр");
        animal.performCheckup();
    }
}