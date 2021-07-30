package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и наказание")
    private String name;

    @Value("Достоевский")
    private String author;

    @Value("1866")
    private int yearOfPublic;

    public String getAuthor(){
        return author;
    }

    public int getYearOfPublic(){
        return yearOfPublic;
    }

    public String getName() {
        return name;
    }
}
