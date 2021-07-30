package hibernate_test2;

import hibernate_test2.entity.Details;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
        public static void main(String[] args) {
            SessionFactory sessionFactory = null;
            Session session = null;
            try {
                sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Details.class)
                        .buildSessionFactory();
                session = sessionFactory.getCurrentSession();
                session.beginTransaction();

                Employee emp = session.get(Employee.class, 2);

                session.delete(emp);


                session.getTransaction().commit();
                System.out.println("done");
            } finally {
                session.close();
                sessionFactory.close();
            }
        }
}
