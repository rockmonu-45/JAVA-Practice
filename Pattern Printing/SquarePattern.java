import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rows and columns

        // Outer loop controls rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            // Move to next line after one row
            System.out.println();
        }
    }
}


// this print this
// * * * *
// * * * *
// * * * *
// * * * *