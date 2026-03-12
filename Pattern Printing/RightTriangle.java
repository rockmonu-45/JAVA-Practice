public class RightTriangle {
    public static void main(String[] args) {

        int n = 4; // number of rows

        // Outer loop for rows
        for(int i = 1; i <= n; i++){

            // Inner loop prints stars equal to row number
            // Row 1 → 1 star
            // Row 2 → 2 stars
            // put j<=i because this print row according to colomn number
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}


// *
// * *
// * * *
// * * * *