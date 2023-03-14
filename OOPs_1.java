class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class OOPs_1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Mahatab");
        e1.salary = 5000;
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
