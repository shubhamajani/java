import java.util.GregorianCalendar;

public class GregorianCalendarDemo 
{

    public static void main(String[] args) 
    {

        GregorianCalendar calendar =
                new GregorianCalendar();

        System.out.println("Year: "
                + calendar.get(GregorianCalendar.YEAR));

        System.out.println("Month: "
                + (calendar.get(GregorianCalendar.MONTH) + 1));

        System.out.println("Day: "
                + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println("Day of Week: "
                + calendar.get(GregorianCalendar.DAY_OF_WEEK));

        System.out.println("Day of Year: "
                + calendar.get(GregorianCalendar.DAY_OF_YEAR));

        System.out.println("Hour: "
                + calendar.get(GregorianCalendar.HOUR));

        System.out.println("Minute: "
                + calendar.get(GregorianCalendar.MINUTE));

        System.out.println("Second: "
                + calendar.get(GregorianCalendar.SECOND));

        System.out.println("Leap Year: "
                + calendar.isLeapYear(
                        calendar.get(GregorianCalendar.YEAR)));
    }
}