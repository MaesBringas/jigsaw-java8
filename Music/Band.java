/*
 * Band.java
 * @author mebs
 * @version 1.0
 */

class Band {
    private String name;
    private int year;
    Person[] members;

    void setName(String name) {
        this.name = name;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setMembers(Person[] members) {
        this.members = members;
    }

    String getName() {
        return this.name;
    }

    int getYear() {
        return this.year;
    }

    Person[] getMembers() {
        return this.members;
    }
}
