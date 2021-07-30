package aop.aspects;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspects {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary(){
//        System.out.println("allMethodsExceptReturnMagazineFromUniLibrary: LOg#10");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetReturnMethodsFromUniLibrary(){
//    }
//
//    @After("allGetReturnMethodsFromUniLibrary()")
//    public void afterGetReturnLoggingAdvice(){
//        System.out.println("afterGetReturnLoggingAdvice: writing Log#2");
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #1");
//    }
//
//

    @Before("aop.aspects.myPointCuts.allAddMethods()")
    public void beforeAddLoggingBookAdvice(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodsegnature - " + signature);
        System.out.println("getMethod = " + signature.getMethod());
        System.out.println("getReturnType = " + signature.getReturnType());
        System.out.println("getName = " + signature.getName());
        if(signature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object o : arguments
                 ) {
                if(o instanceof Book){
                    Book myBook = (Book) o;
                    System.out.println("Название книги " +
                            myBook.getName() +
                            ", автор - " +
                            myBook.getAuthor() +
                            ", год публикации - " +
                            myBook.getYearOfPublic());
                }
            }
        }

        System.out.println("beforeAddBookAdvice: логирование попытки добавить книгу или журнал");
        System.out.println("--------------------------------------");

    }


}
