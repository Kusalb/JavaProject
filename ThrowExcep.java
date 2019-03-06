public class ThrowExcep {
    static void print()
    {
        try
        {
            throw  new NullPointerException("demo");
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught inside print().");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            print();
        }
        catch (NullPointerException e)
        {
            System.out.println("caught in main.");
        }
    }
}
