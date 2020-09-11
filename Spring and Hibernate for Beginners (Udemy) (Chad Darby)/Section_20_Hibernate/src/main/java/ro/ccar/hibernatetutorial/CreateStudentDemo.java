package ro.ccar.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ro.ccar.hibernatetutorial.entity.Student;

import java.text.ParseException;

import static ro.ccar.hibernatetutorial.utils.DateUtils.parseDate;


public class CreateStudentDemo {

    public static void main(String[] args) {

        Student aStudent = null;
        try {
            aStudent = new Student("Rod", "Sanders",
                    parseDate("31/07/2000"), "rod.s@luv2code.com", 8.5f);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        // create session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();     // configure works without specifying "hibernate.cfg.xml" because this is the default name for config file

        // create a session
        Session session = sessionFactory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            // save the student object
            session.save(aStudent);

            // commit transaction
            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
