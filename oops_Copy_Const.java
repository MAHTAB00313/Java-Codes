class Student {
    String name;
    int roll;

    public void prntInfo() {
        System.out.println(name);
        System.out.println(roll);
    }

    Student() {

    }

    //Copy Constructor
    Student(Student s2) {
        name = s2.name;
        roll = s2.roll;  
    }
}

public class oops_Copy_Const {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mahtab";
        s1.roll = 14;
        s1.prntInfo();

        Student s2 = new Student(s1);
        s2.prntInfo();
        
  
    }
    
}
