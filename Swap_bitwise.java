public class Swap_bitwise {
    public static void main(String args[]) {
        int a = 2, b = 3;
        a = a ^ b; // XOR operation
        b = a ^ b; // XOR operation
        a = a ^ b; // XOR operation
        System.out.println("After swapping:");
        System.out.println("A=" + a);
        System.out.println("B=" + b);
    }
}
