/*
 * Date.java
 * @author mebs
 * @version 1.0
 */

class Date {

    int Dday, Dmonth, Dyear;

    Date(){}

    public Date(int day, int month, int year) {
        Dday = day;
        Dmonth = month;
        Dyear = year;
    }
    private static boolean isLeapYear(int year) {
        return !(year % 100 != 0 && year % 4 != 0 && year % 400 != 0);
    }
    static int daysMonth(int month, int year) {
        int maxDays;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            maxDays = 30;
        else if (month == 2)
            maxDays = (isLeapYear(year)) ? 29 : 28;
        else
            maxDays = 31;
        return maxDays;
    }

}
