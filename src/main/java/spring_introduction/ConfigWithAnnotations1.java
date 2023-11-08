package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person =context.getBean("person", Person.class);
        person.callYourPet();

        System.out.println(person.getSurName());
        System.out.println(person.getAge());

//        Cat myCat = context.getBean("catBean",Cat.class);
//        myCat.say();


        context.close();
    }
}
