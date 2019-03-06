public class Swap_no_temp {
    public static void main(String args[]) {
        int a = 10, b = 20;
        System.out.println("value of a and b before swapping\n" + "a = " + a + " b=" + b );
        a = a + b;
        b= a -b;
        a =a -b;
        System.out.println("value of a and b after swapping\n"+ "a = " + a + " b=" + b);
    }

}
