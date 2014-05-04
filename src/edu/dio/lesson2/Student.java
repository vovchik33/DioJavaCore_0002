package edu.dio.lesson2;

/**
 * Created by Vladimir V.Kravchenko on 04.05.2014.
 */
public class Student extends Person {
    public Student(String firstName, String lastName, int age, Profession profession) {
        super(firstName, lastName, age, profession);
    }

    @Override
    void doSomething() {
        System.out.println("Student do something! Nice!");
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Student{")
                .append("firstName='").append(getFirstName()).append('\'')
                .append(", lastName='").append(getLastName()).append('\'')
                .append(", age=").append(getAge())
                .append(", profession=").append(getProfession().description)
                .append('}').toString();
    }

}
