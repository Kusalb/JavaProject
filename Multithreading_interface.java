class Multithreading_interface implements Runnable
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");
        }
        catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
    }
    // Main Class
    public static void main(String[] args)
    {
        for (int i=0; i<8; i++)
        {
            Thread object = new Thread(new Multithreading_interface());
            object.start();
        }
    }
}
