package springIntroduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println(this.hashCode() + " sad Meow-meow");
    }
}
