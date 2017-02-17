/*
 * Student.java
 * @author mebs
 * @version 1.0
 */

public class Student {
    String name, surname;
    double programming, calculus, physics, information, writing;

    public Student() {
    }

    public Student(String name, String surname, double programming, double calculus, double physics, double information, double writing) {
        this.name = name;
        this.surname = surname;
        this.programming = programming;
        this.calculus = calculus;
        this.physics = physics;
        this.information = information;
        this.writing = writing;
    }
}
