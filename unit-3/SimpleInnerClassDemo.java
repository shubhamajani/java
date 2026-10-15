public class SimpleInnerClassDemo 
{

    class Student 
    {
        void display() 
        {
            System.out.println("This is a simple inner class.");
        }
    }

    public static void main(String[] args) 
    {
        SimpleInnerClassDemo obj = new SimpleInnerClassDemo();

        SimpleInnerClassDemo.Student student = obj.new Student();
        student.display();
    }
}