import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// EXERCISE 1 //

        System.out.println("It's a great day today!");
        System.out.println("What is your name?");
        Scanner scanIn = new Scanner(System.in);
        String name = scanIn.nextLine();
        System.out.println("Hello" + name);

        // EXERCISE 2 //
        System.out.println("Enter a number.");
        int firstNum = scanIn.nextInt();

        System.out.println("Enter another number.");
        int anotherNum = scanIn.nextInt();

        System.out.println(firstNum + anotherNum);
        System.out.println(firstNum - anotherNum);

        // EXERCISE 3 //
        System.out.println("What is your balance?");
        int balance = scanIn.nextInt();
        System.out.println("I've granted you $2 more! Your new balance is: " + (balance+2));






    }


}
