class ThreadClass extends Thread 
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
        ThreadClass t = new ThreadClass();
        t.start();
    }
}