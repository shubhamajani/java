public class StaticInnerClassDemo 
{

    static class Student 
    {
        void display() 
        {
            System.out.println("This is a static inner class.");
        }
    }

    public static void main(String[] args) 
    {
        StaticInnerClassDemo.Student student =
                new StaticInnerClassDemo.Student();

        student.display();
    }
}