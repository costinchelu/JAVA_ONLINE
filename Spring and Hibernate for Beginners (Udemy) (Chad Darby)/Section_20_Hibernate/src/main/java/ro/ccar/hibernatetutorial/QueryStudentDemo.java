package ro.ccar.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ro.ccar.hibernatetutorial.entity.Student;

import java.util.List;


public class QueryStudentDemo {

    public static void main(String[] args) {

        List<Student> allStudents;
        List<Student> whereStudent;
        List<Student> whereAlsoStudent;
        List<Student> studentLike;

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            // SELECT * FROM student;
            allStudents = session.createQuery("from Student").getResultList();

            //SELECT * FROM student WHERE last_name = 'Wall' OR first_name = 'John';
            whereStudent = session.createQuery("from Student s where s.lastName = 'Doe'").getResultList();
            whereAlsoStudent = session.createQuery("from Student s where s.lastName = 'Wall' OR s.firstName = 'John'").getResultList();

            // SELECT * FROM student WHERE email LIKE '%luv%;
            studentLike = session.createQuery("from Student s where s.email like '%luv%'").getResultList();

            session.getTransaction().commit();
        }
        displayStudents(allStudents);
        displayStudents(whereStudent);
        displayStudents(whereAlsoStudent);
        displayStudents(studentLike);
    }

    private static void displayStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
    }
}

