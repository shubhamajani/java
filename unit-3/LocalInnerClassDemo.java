public class LocalInnerClassDemo 
{

    void display() 
    {

        class Student 
        {
            void show() 
            {
                System.out.println("This is a local inner class.");
            }
        }

        Student student = new Student();
        student.show();
    }

    public static void main(String[] args) 
    {
        LocalInnerClassDemo obj = new LocalInnerClassDemo();
        obj.display();
    }
}