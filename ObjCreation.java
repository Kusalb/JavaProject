import java.util.Scanner;
public class ObjCreation {
    Scanner s1= new Scanner(System.in);
    String id= s1.nextLine();
    String name = s1.nextLine();

    public static void main(String[] args) {
        ObjCreation obj= new ObjCreation();
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
