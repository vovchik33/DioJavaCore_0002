package edu.dio.lesson2;

/**
 * Created by Vladimir V.Kravchenko on 04.05.2014.
 */
public class Worker extends Person{
    public Worker(String firstName, String lastName, int age, Profession profession) {
        super(firstName, lastName, age, profession);
    }

    @Override
    void doSomething() {
        System.out.println("Worker do something! At least!");
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Worker{")
                .append("firstName='").append(getFirstName()).append('\'')
                .append(", lastName='").append(getLastName()).append('\'')
                .append(", age=").append(getAge())
                .append(", profession=").append(getProfession().description)
                .append('}').toString();
    }

}
