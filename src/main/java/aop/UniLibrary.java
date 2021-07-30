package aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary{
    public void getBook(){
        System.out.println("Мы берем книгу из Уни");
        System.out.println("--------------------------------------");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("Возвращаем книжку в Уни Библио");
        return "Война и Мир";
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из Уни");
        System.out.println("--------------------------------------");

    }


    public void returnMagazine(){
        System.out.println("Возвращаем журнал из Уни");
        System.out.println("--------------------------------------");

    }


    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу в Уни");
        System.out.println("--------------------------------------");

    }


    public void addMagazine(){
        System.out.println("Мы добавляем журнал в Уни");
        System.out.println("--------------------------------------");

    }
}
