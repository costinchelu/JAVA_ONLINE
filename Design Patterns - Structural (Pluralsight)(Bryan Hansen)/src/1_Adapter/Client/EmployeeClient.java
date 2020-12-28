package Client;

import Adaptee.EmployeeCustom;
import Adaptee.EmployeeCSV;
import Adapter.EmployeeAdapter;
import Adapter.EmployeeAdapterCSV;
import ITarget.Employee;
import LegacyCode.EmployeeDefault;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();


        Employee employeeDefault =
                new EmployeeDefault("1234", "John", "Whick", "john@whick.com");
        employees.add(employeeDefault);



        EmployeeCustom employeeCustom =
                new EmployeeCustom("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapter(employeeCustom));



        EmployeeCSV employeeCSV =
                new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));



        return employees;
    }
}

/*
Using adapters we can adapt employeeCustom & employeeCSV to our legacy Employee
 */