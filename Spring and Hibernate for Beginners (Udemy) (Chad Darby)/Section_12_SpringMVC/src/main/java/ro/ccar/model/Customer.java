package ro.ccar.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    // fields with validators (conditions and error messages)

    @NotNull(message = "Required field")
    @Size(min=1, message = "Require at least a character")
    private String firstName;

    @NotNull(message = "Required field")
    @Size(min=1, message = "Require at least a character")
    private String lastName;


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

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

