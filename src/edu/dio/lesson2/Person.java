package edu.dio.lesson2;

/**
 * Created by Vladimir V.Kravchenko on 04.05.2014.
 */
public abstract class Person implements PersonGetters, PersonSetters{
    private String firstName;
    private String lastName;
    private int age;
    private Profession profession;

    public Person(String firstName, String lastName, int age, Profession profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public Profession getProfession() {
        return profession;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    void born(){ //initialize
        System.out.println("Person was borned");
    };

    void die(){ //finalize
        System.out.println("Person died");
    };

    abstract void doSomething(); //some actions should be implemented in child class

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Person{")
                .append("firstName='").append(firstName).append('\'')
                .append(", lastName='").append(lastName).append('\'')
                .append(", age=").append(age)
                .append(", profession=").append(profession)
                .append('}').toString();
    }
}
