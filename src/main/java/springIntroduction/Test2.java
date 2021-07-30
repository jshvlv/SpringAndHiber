package springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog myDog2 = context.getBean("myPet", Dog.class);

//        myDog.setName("Белка");
//        myDog.setName("Стрелка");

        System.out.println(myDog==myDog2 ? "да" : "нет");

        context.close();
    }
}
