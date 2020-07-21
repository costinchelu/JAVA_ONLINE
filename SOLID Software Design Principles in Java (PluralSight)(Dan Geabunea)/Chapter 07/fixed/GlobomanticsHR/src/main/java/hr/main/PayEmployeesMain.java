package hr.main;

import hr.notifications.EmailSender;
import hr.notifications.EmployeeNotifier;
import hr.payment.PaymentProcessor;
import hr.persistence.EmployeeFileRepository;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;

public class PayEmployeesMain {

    /*
    Now here we need to create the dependencies for repo and notifier
    in our case, the repo has a csv processor and the notifier sends emails, but that can be extended further
     */

    public static void main(String[] args) {
        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        EmployeeRepository employeeRepository = new EmployeeFileRepository(serializer);
        EmployeeNotifier employeeNotifier = new EmailSender();

        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeRepository, employeeNotifier);

        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
/*
We need to create instances for serializer, repo and notifier in main app. 

InterfaceClass i = new SubClass();
*/