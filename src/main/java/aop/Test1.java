package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary ul = context.getBean("uLibraryBean", UniLibrary.class);
        SchoolLibrary sl = context.getBean("sLibraryBean", SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);

        ul.getBook();
        ul.getMagazine();
        ul.addBook("Петя", book);
        ul.addMagazine();


        context.close();
    }
}
