import java.util.Scanner;
public class Palindrome {
    public void method(){
        int r,sum=0,tmp,n;
        System.out.print("Enter the number to be checked: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        tmp =n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(tmp==sum)
            System.out.println(tmp+ " is a palindrome number");
        else
            System.out.println(tmp+ " is not a palindrome number");
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.method();
    }
}
