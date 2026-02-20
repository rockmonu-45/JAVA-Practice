import java.util.Scanner;

public class ifelse{
    public static void main(String[] args){
        String name = "Monu";
        // int age = 19;
         Scanner sc = new Scanner(System.in);

         System.out.println("enter your age ");
         int age = sc.nextInt();

        if(age >= 18){
            System.out.println("you are Adult so you can Vote");

        }else{
            System.out.println("you cannot Vote");
        }



    }
}