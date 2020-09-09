package ro.ccar.model;

import javax.validation.constraints.*;

public class Customer {

    // fields with validators (conditions and error messages)

    @NotNull(message = "Required field")
    @Size(min=1, message = "Require at least a character")
    private String firstName;

    @NotNull(message = "Required field")
    @Size(min=1, message = "Require at least a character")
    private String lastName;

    // we use a wrapper class to benefit from the WebDataBinder in controller which will only work with classes
    @NotNull(message = "Required field")
    @Min(value=0, message="Must be 0 or greater")
    @Max(value=10, message="Must be less than 10")
    private Integer freePasses;

    //@NotNull(message = "Please enter your postal code")
    @Pattern(regexp = "^[a-zA-Z0-9]{6}", message="Postal code is made of 6 literal or numeric characters")
    private String postalCode;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

