package hibernate_test;

import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employee set salary=1000 where name='Elena'").executeUpdate();
//            Employee emp = session.get(Employee.class,  1);
//            emp.setSalary(345345);

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
