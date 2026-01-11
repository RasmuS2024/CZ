package animals;

import animals.interfaces.Feedable;
import animals.interfaces.MedicalCheckup;
import java.util.Date;

public class Panda extends Animal implements Feedable, MedicalCheckup {
    private Date lastCheckup;
    
    public Panda(String name, int age, String species) {
        super(name, age, species);
        this.lastCheckup = new Date();
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Ы-ы-ы! (звуки панды)");
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " ест бамбук");
    }
    
    @Override
    public String getFavoriteFood() {
        return "бамбук";
    }
    
    @Override
    public int getFeedingTime() {
        return 11;
    }
    
    @Override
    public void performCheckup() {
        System.out.println("Осматриваем панду " + getName());
        lastCheckup = new Date();
    }
    
    @Override
    public Date getLastCheckupDate() {
        return lastCheckup;
    }
    
    @Override
    public void setLastCheckupDate(Date date) {
        lastCheckup = date;
    }
    
    @Override
    public boolean isVaccinated() {
        return true;
    }
}
