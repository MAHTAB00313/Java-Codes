class Bulb {
    String name;
    String company;
    int cost;

    void info() {
        System.out.println(name);
        System.out.println(cost);
        System.out.println(company);
    }
}
class LedBulb extends Bulb{
    String type;
    int leds;

    void info() {
        System.out.println(name);
        System.out.println(cost);
        System.out.println(company);
        System.out.println(type);
        System.out.println(leds);
    }
}
class nightBulb extends Bulb {
    String color;
    int watt;
    void info() {
        System.out.println(name);
        System.out.println("$ "+cost);
        System.out.println(company);
        System.out.println(color);
        System.out.println(watt+"W");
    }
}
public class Herarchial_Inhertance {

    public static void main(String[] args) {
        LedBulb l1 = new LedBulb();
        l1.name = "Mahtab";
        l1.type = "led";
        l1.leds = 10;
        l1.company = "Stream";
        l1.cost = 100;
        l1.info();

        nightBulb n1 = new nightBulb();
        n1.name = "Aman";
        n1.color = "Green";
        n1.company = "Rebels";
        n1.cost = 90;
        n1.watt = 2;
        n1.info();
    }
}
