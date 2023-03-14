    /*Encapsulation in Java is a mechanism to wrap up variables(data) and 
    methods(code) together as a single unit. It is the process of hiding 
    information details and protecting data and behavior of the object.
    It is one of the four important OOP concepts. The encapsulate class is
    easy to test, so it is also better for unit testing. 
Note:    i) Declare the class variable as a Private
        ii) Declare the class method as a Public
    */

class A {
    private int value;

    //Setter
    public void setVal(int x) {
        value = x;
    }
    //getter
    public int getVal() {
        return value++;
    }

}
public class OOPs_Encap {
    public static void main(String[] args) {
        
        A a1 = new A();
        a1.setVal(10);
        System.out.println(a1.getVal());
        System.out.println(a1.getVal());


    }
}
