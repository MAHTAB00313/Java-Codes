class Pen {
    String colur;
    String type;
    String name;

    public void prntInfo() {
       System.out.println("About Pen: ");
        System.out.println(this.name);
        System.out.println(this.colur);
        System.out.println(this.type);
        
    }
}

class Student {
    String name;
    int age;
    char gender;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
    Student(String name, int age){
       this.name=name;
       this.age=age;
    }
}


public class oops_class {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.name = "Agnimest";
        // p1.colur = "Blue";
        // p1.type = "BAllPoint";

        // Pen p2 = new Pen();
        // p2.colur= "Black";
        // p2.name= "LincLizer";
        // p2.type = "Gel";

        // p1.prntInfo();
        // p2.prntInfo();

        Student s1 = new Student("Aman",23);
        s1.printInfo();

        // Student s2 = new Student();
        // s2.age=13;
        // s2.name = "Aman";
        // s2.gender = 'M';
        // System.out.println("2nd Student");
        // s2.printInfo();
        



    }
}
