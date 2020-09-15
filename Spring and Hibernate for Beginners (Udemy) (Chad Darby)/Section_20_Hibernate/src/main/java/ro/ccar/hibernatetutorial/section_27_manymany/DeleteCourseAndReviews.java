package ro.ccar.hibernatetutorial.section_27_manymany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ro.ccar.hibernatetutorial.section_27_manymany.entity.Course;
import ro.ccar.hibernatetutorial.section_27_manymany.entity.Instructor;
import ro.ccar.hibernatetutorial.section_27_manymany.entity.InstructorDetail;
import ro.ccar.hibernatetutorial.section_27_manymany.entity.Review;

public class DeleteCourseAndReviews {

    private static final String CONFIG_FILE = "hibernate.cfg.review.xml";
    private static final int COURSE_TO_DELETE_ID = 10;

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

            Course courseTemp = session.get(Course.class, COURSE_TO_DELETE_ID);
            session.delete(courseTemp);

            System.out.println("Deleted course with id " + COURSE_TO_DELETE_ID + " and subsequently it's own reviews");

            session.getTransaction().commit();

        } catch (Exception e) {
            session.close();
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
