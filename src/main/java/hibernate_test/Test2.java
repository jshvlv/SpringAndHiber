package hibernate_test;

import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
                //Adding new people
            Employee em = new Employee("Oleg", "Sidorov", "HR", 800);
            session.beginTransaction();
            session.save(em);
//            session.getTransaction().commit();
            System.out.println("added");
                //Getting people by Id
            int myId = em.getId();
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println("Employee from DataBase: " +
                    employee);

        } finally {
            sessionFactory.close();
        }
    }
}
