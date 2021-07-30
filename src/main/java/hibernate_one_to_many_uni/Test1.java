package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
        public static void main(String[] args) {
            SessionFactory sessionFactory = null;
            Session session = null;
            try {
//                sessionFactory = new Configuration().configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
//                        .buildSessionFactory();
//                session = sessionFactory.getCurrentSession();
//
//                Employee em1 = new Employee("Elena", "Vorobey", 800);
//                Employee em2 = new Employee("Nikita", "Olegov", 100);
//                Department dep = new Department("HR", 300, 1200);
//                dep.addEmployeeToDepartment(em1);
//                dep.addEmployeeToDepartment(em2);
//                session.beginTransaction();
//
//                session.save(dep);
//
//                session.getTransaction().commit();
//                System.out.println("done");
//-------------------------------------------------------------
//                sessionFactory = new Configuration().configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
//                        .buildSessionFactory();
//                session = sessionFactory.getCurrentSession();
//
//                session.beginTransaction();
//
//                Department department = session.get(Department.class, 3);
//
//                System.out.println(department);
//                System.out.println(department.getEmps());
//
//                session.getTransaction().commit();
//                System.out.println("done");

                //-------------------------------------------------------------
                sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
                        .buildSessionFactory();
                session = sessionFactory.getCurrentSession();

                session.beginTransaction();

                Department dep = session.get(Department.class, 3);
                session.delete(dep);

                session.getTransaction().commit();
                System.out.println("done");



            } finally {
                session.close();
                sessionFactory.close();
            }
        }
}
