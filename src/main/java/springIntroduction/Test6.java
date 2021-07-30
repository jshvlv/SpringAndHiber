package springIntroduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        MyConfig.class
                );

//        Person p = context.getBean("personBean", Person.class);
//        p.callYourPet();

        Pet cat = context.getBean("catBean", Pet.class);
        cat.say();

        Pet cat2 = context.getBean("catBean", Pet.class);
        cat2.say();

        Person p = context.getBean("personBean", Person.class);
        p.callYourPet();

        System.out.println(p);
    }
}
