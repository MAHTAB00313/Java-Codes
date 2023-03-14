class Supper {
    int a = 10;

    void msg() {
        System.out.println("Hello");
    }
    
    Supper() {
        System.out.println("rotcurtsnoc");
    }
}
class Subb extends Supper {
    int a = 20;

    void Info() {
    System.out.println(a); // for subcalss variable
    System.out.println(super.a); // for superclass variable
    }

    void msg() {
        super.msg(); // for Superclass method 
        System.out.println("Hii");
    }

    Subb() {
        super(); // for Superclass Constructor
        System.out.println("constructor");
    }
}
public class SuperKey_OOps {
    public static void main(String[] args) {
        Subb s1 = new Subb();
        s1.Info();
        s1.msg();

    }
}
