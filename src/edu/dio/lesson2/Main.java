package edu.dio.lesson2;

/**
 *  Created by Vladimir V.Kravchenko on 04.05.2014.
 */
public class Main {

    public static void main(String[] args) {
        Person student1, student2, student3;
        Person worker1, worker2, worker3;

        //objects initialization
        student1 = new Student("Vladimir", "Kravchenko", 32, Profession.STUDENT);
        student2 = new Student("Sergej", "Ivanchenko", 22, Profession.STUDENT);
        student3 = student1;
        worker1 = new Worker("Vladimir", "Kravchenko", 32, Profession.ENGINEER);
        worker2 = new Worker("Nikolaj", "Punchenko", 30, Profession.ARCHITECT);
        worker3 = worker1;

        //data printing
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);

        //objects comparison
        System.out.println(student1==student2);
        System.out.println(student1==student3);
        System.out.println(student1.equals(student3));
        System.out.println(student1==worker1);
        System.out.println(student1==worker2);
        System.out.println(student1==worker3);
        System.out.println(student1.equals(worker1));
        System.out.println(student1.equals(worker2));
        System.out.println(student1.equals(worker3));
    }
}
