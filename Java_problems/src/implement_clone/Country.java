package implement_clone;

public class Country {

    private String countryName;
    private int countryCode;


    public Country(String countryName, int countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    // implement copy contructor
    public Country(Country original) {
        this.countryCode = original.countryCode;
        this.countryName = original.countryName;
    }
}
