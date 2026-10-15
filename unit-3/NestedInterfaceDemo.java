public class NestedInterfaceDemo 
{

    interface Student 
    {
        void display();
    }

    static class CollegeStudent implements Student 
    {
        public void display() 
        {
            System.out.println("This is an example of nested interface.");
        }
    }

    public static void main(String[] args) 
    {
        CollegeStudent student = new CollegeStudent();
        student.display();
    }
}