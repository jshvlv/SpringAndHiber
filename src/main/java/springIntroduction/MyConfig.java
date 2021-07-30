package springIntroduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("config.properties")
//@ComponentScan("springIntroduction")
public class MyConfig {

    @Bean//beanId is name  of method
    @Scope("prototype")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }


}
