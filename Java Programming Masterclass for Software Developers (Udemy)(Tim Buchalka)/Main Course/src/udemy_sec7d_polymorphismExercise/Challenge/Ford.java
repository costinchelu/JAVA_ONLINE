package udemy_sec7d_polymorphismExercise.Challenge;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngien() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return  "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return  "Ford -> brake()";
    }
}


