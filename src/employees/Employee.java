package employees;

public abstract class Employee {
    private String name;
    private int id;
    private String position;
    
    public Employee(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }
    
    public String getName() { return name; }
    public int getId() { return id; }
    public String getPosition() { return position; }
}
