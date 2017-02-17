/*
 * Person.java
 * @author mebs
 * @version 1.0
 */

class Person {
    private String name;
    private int birthday;

    Person(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    String getName() {
        return this.name;
    }

    int getBirthday() {
        return this.birthday;
    }
}
