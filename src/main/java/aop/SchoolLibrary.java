package aop;

import org.springframework.stereotype.Component;

@Component("sLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Мы берем книгу из школы");
    }
}
