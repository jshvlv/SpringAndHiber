package springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("myPet", Dog.class);

        dog.say();

        Dog yourDog = context.getBean("cat", Dog.class);

        context.close();
    }
}
