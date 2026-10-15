import java.util.Calendar;

public class DateCalculationDemo 
{

    public static void main(String[] args) 
    {

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Date: "
                + calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 10);

        System.out.println("After Adding 10 Days: "
                + calendar.getTime());

        calendar.add(Calendar.MONTH, 2);

        System.out.println("After Adding 2 Months: "
                + calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, -5);

        System.out.println("After Subtracting 5 Days: "
                + calendar.getTime());

        calendar.add(Calendar.MONTH, -1);

        System.out.println("After Subtracting 1 Month: "
                + calendar.getTime());
    }
}