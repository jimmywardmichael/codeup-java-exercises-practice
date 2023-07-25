import java.util.Scanner;

public class People {


    public static void main(People[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        java.lang.String userInput = sc.next();

        // Don't do this!
        boolean confirmation = userInput.equals("y");

        // Now you can use the 'confirmation' variable to check if the user entered 'y'
        if (confirmation) {
            System.out.println("You chose to continue!");
        } else {
            System.out.println("You chose not to continue.");
        }
    }
}

