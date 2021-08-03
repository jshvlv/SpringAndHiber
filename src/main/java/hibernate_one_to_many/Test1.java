package hibernate_one_to_many;


import hibernate_one_to_many.entity.Department;
import hibernate_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
        public static void main(String[] args) {
            SessionFactory sessionFactory = null;
            Session session = null;
            try {
                //Adding entities to DB
//                sessionFactory = new Configuration().configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
//                        .buildSessionFactory();
//                session = sessionFactory.getCurrentSession();
//
//                Department dep = new Department("Sales", 800, 1500);
//                Employee emp1 = new Employee("Zaur", "Tregulov", 800);
//                Employee emp2 = new Employee("Elena", "Smirnova", 1000);
//                Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//
//                dep.addEmployeeToDepartment(emp1);
//                dep.addEmployeeToDepartment(emp2);
//                dep.addEmployeeToDepartment(emp3);
//
//
//                session.beginTransaction();
//
//                session.save(dep);
//
//                session.getTransaction().commit();
//                System.out.println("done");
                //***************************************************
//Output entities from DB
                sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
                        .buildSessionFactory();
                session = sessionFactory.getCurrentSession();



                session.beginTransaction();

                System.out.println("Get Department");
                Department department = session.get(Department.class, 5);

                System.out.println("Show Department");
                System.out.println(department);

                System.out.println("Show employees from dep");
                System.out.println(department.getEmps());

                session.getTransaction().commit();

                System.out.println("done");
            } finally {
                session.close();
                sessionFactory.close();
            }
        }
}
