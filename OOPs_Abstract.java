abstract class Sound {
   abstract void Info();
}
class Dog extends Sound {
    @Override
    void Info() {
        System.out.println("He barkes");
        
    }
}
class Cat extends Sound {
    @Override
    void Info() {
    System.out.println("She mews");
}
}
public class OOPs_Abstract {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Info();
        Cat c1 = new Cat();
        c1.Info();
    }
}
