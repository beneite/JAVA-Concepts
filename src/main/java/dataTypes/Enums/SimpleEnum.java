/**
 *
 */
package dataTypes.Enums;

public class SimpleEnum {

    enum WeekDays{
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);

        int dayNumber;
        WeekDays(int dayNumber){
            this.dayNumber = dayNumber;
        }

    }

    public static void isWorkingDay(WeekDays weekDays){

        switch (weekDays){
            case SUNDAY -> {
                System.out.println("Holiday");
                System.out.println("Day number:"+weekDays.dayNumber);
            }

            default -> {
                System.out.println("No Holiday");
                System.out.println("Day number:"+weekDays.dayNumber);
            }
        }
    }

    public static void main(String[] args){

        WeekDays WeekDayOne = WeekDays.MONDAY;
        isWorkingDay(WeekDayOne);

        WeekDays WeekDayTwo = WeekDays.SUNDAY;
        isWorkingDay(WeekDayTwo);

    }
}
