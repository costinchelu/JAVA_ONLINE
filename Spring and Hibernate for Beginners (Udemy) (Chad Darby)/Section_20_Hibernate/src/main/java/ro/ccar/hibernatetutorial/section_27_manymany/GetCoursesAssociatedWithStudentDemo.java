package ro.ccar.hibernatetutorial.section_27_manymany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ro.ccar.hibernatetutorial.section_27_manymany.entity.*;

import java.util.ArrayList;
import java.util.List;

public class GetCoursesAssociatedWithStudentDemo {

    private static final String CONFIG_FILE = "hibernate.cfg.coursestudent.xml";
    private static final String LAST_NAME_LOOKUP = "Rupert";


    public static void main(String[] args) {

        Student student;

        SessionFactory sessionFactory = new Configuration()
                .configure(CONFIG_FILE)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            student = session
                    .createQuery("from Student s where s.lastName = :lastname", Student.class)
                    .setParameter("lastname", LAST_NAME_LOOKUP)
                    .uniqueResult();

            if (student != null) {
                System.out.println(student);
                System.out.println(student.getLastName() +  "'s courses: " + student.getCourses());
            }

            session.getTransaction().commit();

        } catch (Exception e) {
            session.close();
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
