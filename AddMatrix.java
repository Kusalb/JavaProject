import java.util.Scanner;

public class AddMatrix {

    public static void main(String[] args) {


        int i, j;


        Scanner s1 = new Scanner(System.in);

        int first[][] = new int[2][2];
        int second[][] = new int[2][2];
        int sum[][] = new int[2][2];

        System.out.println("Enter the values for 1st matrix");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                first[i][j] = s1.nextInt();
            }
        }

        System.out.println("Enter the values for 2nd matrix");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                second[i][j] = s1.nextInt();
            }
        }

        System.out.println("The sum of matrix is");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                sum[i][j] = first[i][j] + second[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }

    }
}



