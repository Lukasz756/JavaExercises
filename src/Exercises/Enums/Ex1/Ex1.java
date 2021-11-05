package Exercises.Enums.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Saturday is holiday: "+Weekday.SATURDAY.isHoliday());
        System.out.println("Friday is weekday: "+Weekday.FRIDAY.isWeekDay());
        Weekday.TUESDAY.whichIsGreater(Weekday.FRIDAY);
    }
}
