package ro.ccar.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ro.ccar.hibernatetutorial.entity.Student;


public class ReadStudentDemo {

    public static void main(String[] args) {

        Student aStudent = new Student("Bob", "Fiskars", "bob.f@luv2code.com");
        Student bStudent;

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // try with resources: (but it also works with try - finally)
        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            // save aStudent
            session.beginTransaction();
            session.save(aStudent);
            System.out.println("aStudent generated id = " + aStudent.getId());

            // read aStudent to bStudent (by aStudent id)
            bStudent = session.get(Student.class, aStudent.getId());
            session.getTransaction().commit();
        }

        System.out.println("bStudent -> " + bStudent.toString());
    }
}
