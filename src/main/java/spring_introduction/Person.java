package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
   @Value("${person.surname}")
    private String surName;
   @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person: set surname");
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
//        @Autowired
//        public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }



    public void callYourPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
//setPet->setPet

    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }
//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }
}
