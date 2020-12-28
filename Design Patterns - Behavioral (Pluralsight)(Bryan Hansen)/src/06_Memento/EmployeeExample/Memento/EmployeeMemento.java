package EmployeeExample.Memento;

public class EmployeeMemento {

    // in this case we are not interested storing the address of the employee
    private String name;
    private String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


}
