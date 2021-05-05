package java_techie_streamapi.practical.map_example;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {

        List<Customer> customerList = CustomerDatabase.getAll();

        // we want to convert the list of Customer objects to a list of emails (one-to-one mapping)
        List<String> customerEmails = customerList.stream()
                .map(customer -> customer.getName() + " " + customer.getEmail())
                .collect(Collectors.toList());

        System.out.println(customerEmails);

        List<List<String>> customerPhone = customerList.stream()
                .map(Customer::getPhoneNumbers)
                .collect(Collectors.toList());
        // we get a list of lists
        System.out.println(customerPhone);

        // to flatten the data (one to many):
        List<String> properCustomerPhones = customerList.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        System.out.println(properCustomerPhones);


    }
}
