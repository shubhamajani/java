public class ExceptionChainingDemo 
{

    static void method() throws Exception 
    {
        Exception cause = new Exception("Original Exception");
        throw new Exception("New Exception", cause);
    }

    public static void main(String[] args) 
    {
        try 
        {
            method();
        } catch (Exception e) 
        {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }
}