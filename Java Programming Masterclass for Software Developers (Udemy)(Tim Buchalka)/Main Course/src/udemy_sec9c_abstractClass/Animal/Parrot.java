package udemy_sec9c_abstractClass.Animal;


public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
