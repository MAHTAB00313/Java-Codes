class Student {
    String nameC;
    int ageC;

    public void prntInfo() {
        System.out.println(nameC);
        System.out.println(ageC);
    }

    //default Constructor
    Student(/*No Parameter */) {
        System.out.println("Defautl is called");
    }

    //Parameterize Constructor
    Student(String name, int age) {
        nameC = name;
        ageC = age;
    }
}

public class opps_Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.prntInfo();

        String a = "Amana";
        int b = 12;
        Student s2 = new Student(a,b);
        s2.prntInfo();


    }
}
