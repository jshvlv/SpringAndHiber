package hibernate_one_to_one;

import hibernate_one_to_one.entity.Details;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
        public static void main(String[] args) {
            SessionFactory sessionFactory = null;
            Session session = null;
            try {
                sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Details.class)
                        .buildSessionFactory();
                session = sessionFactory.getCurrentSession();
//                Employee employee = new Employee("Kola", "Avinov", "IT", 45);
//
//                Details details = new Details("NY", "234234234", "kolan@ya.ru");
//
//                details.setEmployee(employee);
//                employee.setEmpDetails(details);
                session.beginTransaction();
                Details details = session.get(Details.class, 1);
                details.getEmployee().setEmpDetails(null);

                session.delete(details);

                session.getTransaction().commit();
                System.out.println("done");
            } finally {
                session.close();
                sessionFactory.close();
            }
        }
}
