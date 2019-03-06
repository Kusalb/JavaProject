public class Multithreading_thread extends Thread
{
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
    public static void main(String[] args)
    {
        for (int i=0; i<10; i++)
        {
            Multithreading_thread object = new Multithreading_thread();
            object.start();
        }
    }
}
