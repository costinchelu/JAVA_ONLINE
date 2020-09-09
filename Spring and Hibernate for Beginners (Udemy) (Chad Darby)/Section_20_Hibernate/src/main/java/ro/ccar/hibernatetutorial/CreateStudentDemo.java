package ro.ccar.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ro.ccar.hibernatetutorial.entity.Student;


public class CreateStudentDemo {

    public static void main(String[] args) {

        Student aStudent = new Student("Sid", "Amber", "sid.a@luv2code.com");

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
