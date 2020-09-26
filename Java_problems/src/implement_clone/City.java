package implement_clone;

public class City implements Cloneable {

    private String cityName;


    public City(String cityName) {
        this.cityName = cityName;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // implementing a copy constructor
    public City(City original) {
        this.cityName = original.cityName;
    }
}
