package udemy_sec9c_abstractClass.Animal;


public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at flying, can I go for a swim instead?");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " penguin is fishing.");
    }
}
