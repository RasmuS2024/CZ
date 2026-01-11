package animals;

import animals.interfaces.Feedable;
import animals.interfaces.MedicalCheckup;
import java.util.Date;

public class Dog extends Animal implements Feedable, MedicalCheckup {
    private Date lastCheckup;
    
    public Dog(String name, int age, String species) {
        super(name, age, species);
        this.lastCheckup = new Date();
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " гавкает: Гав-гав!");
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " ест кость");
    }
    
    @Override
    public String getFavoriteFood() {
        return "кость";
    }
    
    @Override
    public int getFeedingTime() {
        return 9;
    }
    
    @Override
    public void performCheckup() {
        System.out.println("Осматриваем собаку " + getName());
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
