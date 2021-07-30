package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice:" +
//                "логгируем получение списка студентов перед методом getStudents");
//    }
//
//
//
//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student s1 = students.get(0);
//        String sername = s1.getNameSurname();
//        sername = "Mr " + sername;
//        s1.setNameSurname(sername);
//
//        double avg = s1.getAvgGrade();
//        avg = avg+1;
//        s1.setAvgGrade(avg);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice:" +
//                "логгируем получение списка студентов после работы  метода getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())",
    throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: Логируем исключение " + exception);
    }

    @After("execution(* getStudents())")
    public void afterAdvice(){
        System.out.println("afterAdvice: логгируем после эдвайс");
    }


}
