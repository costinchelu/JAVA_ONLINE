package ro.ccar.hibernatetutorial.section_26_onemany_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import ro.ccar.hibernatetutorial.section_26_onemany_uni.entity.Course;
import ro.ccar.hibernatetutorial.section_26_onemany_uni.entity.Instructor;
import ro.ccar.hibernatetutorial.section_26_onemany_uni.entity.InstructorDetail;
import ro.ccar.hibernatetutorial.section_26_onemany_uni.entity.Review;

import java.util.List;


public class GetCourseAndReviewsDemo {

    private static final String CONFIG_FILE = "hibernate.cfg.review.xml";
    private static final int COURSE_TO_GET_ID = 10;

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure(CONFIG_FILE)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            // we have a LAZY implementation (we need to implicitly get courses)
            Course course1 = session.get(Course.class, COURSE_TO_GET_ID);
            System.out.println("Course 1:");
            System.out.println(course1);
            System.out.println("Course 1 reviews:");
            System.out.println(course1.getReviews());

            session.getTransaction().commit();

        } catch (Exception e) {
            session.close();
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
