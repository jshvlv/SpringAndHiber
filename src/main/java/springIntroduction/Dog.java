package springIntroduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
public class Dog implements Pet{
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("This is Dog's constructor");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog's init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog's destroy method");
    }
}
