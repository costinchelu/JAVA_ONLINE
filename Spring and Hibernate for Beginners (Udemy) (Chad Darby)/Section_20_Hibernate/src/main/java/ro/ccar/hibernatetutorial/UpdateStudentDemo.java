package ro.ccar.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ro.ccar.hibernatetutorial.entity.Student;
import ro.ccar.hibernatetutorial.utils.DateUtils;

import java.text.ParseException;


public class UpdateStudentDemo {

    public static void main(String[] args) {

        int studentId = 10;
        Student aStudent;

        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory()) {

            Session session;
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            // now the object will be persistent
            aStudent = session.get(Student.class, studentId);
            System.out.println(aStudent);

            // it is a persistent object, so a setter also updates the database after committing
            aStudent.setDateOfBirth(DateUtils.parseDate("12/05/2000"));

            session.getTransaction().commit();

            //-------------------

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            // this is a general update statement which can affect more than one row in DB
            session.createQuery("update Student s set s.email = 'foo@gmail.com' where lower(s.firstName) = 'bonita'").executeUpdate();

            session.getTransaction().commit();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

