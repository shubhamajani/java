class RunnableClass implements Runnable 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread: " + i);
        }
    }
    public static void main(String args[]) 
    {
        RunnableClass obj = new RunnableClass();
        Thread t = new Thread(obj);
        t.start();
    }
}