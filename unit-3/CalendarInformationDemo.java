import java.util.Calendar;

public class CalendarInformationDemo 
{

    public static void main(String[] args) 
    {

        Calendar calendar = Calendar.getInstance();

        System.out.println("Year: "
                + calendar.get(Calendar.YEAR));

        System.out.println("Month: "
                + (calendar.get(Calendar.MONTH) + 1));

        System.out.println("Day: "
                + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Day of Week: "
                + calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println("Day of Year: "
                + calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println("Hour: "
                + calendar.get(Calendar.HOUR));

        System.out.println("Minute: "
                + calendar.get(Calendar.MINUTE));

        System.out.println("Second: "
                + calendar.get(Calendar.SECOND));
    }
}