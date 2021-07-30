package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        try {
            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(MyConfig.class);

            University university = context.getBean("university", University.class);

            university.addStudents();

            List<Student> students = university.getStudents();

            System.out.println("-----------------------");
            System.out.println(students);

            context.close();
        } catch (Exception e){}
    }
}
