package streams.model;

public class Person {

    private long id;
    private String name;
    private String nationality;
    private double height;
    private int weight;

    public Person(long id, String name, String nationality, double height, int weight) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
