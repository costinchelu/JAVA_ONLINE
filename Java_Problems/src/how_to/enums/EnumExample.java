package how_to.enums;

interface DemoInterface {

}


// every enum we create, extends an abstract class called Enum
// it can implement interfaces
enum Mobile implements DemoInterface {
    APPLE(100),
    SAMSUNG(90),
    HUAWEI(80);

    int price;

    Mobile(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}


public class EnumExample {

    public static void main(String[] args) {

        Mobile m = Mobile.APPLE;

        switch (m) {
            case APPLE:
                System.out.println("It's Apple");
                break;
            case SAMSUNG:
                System.out.println("It's Samsung");
                System.out.println(Mobile.SAMSUNG.getPrice());
                break;
            case HUAWEI:
                System.out.println("it's Huawei");
                System.out.println(Mobile.HUAWEI.ordinal());
        }
    }
}
