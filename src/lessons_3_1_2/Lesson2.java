package lessons_3_1_2;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        // we only printed true/false before, but let's use those outputs
        // to change the flow of the program
        Scanner input = new Scanner(System.in);
        // Ask a user for their favorite number
        System.out.println("What is your favorite number?");
        int favNumber = input.nextInt();

        // if it is above 12, print "That's a large number!"
        // if it is 12 or lower, print "That's small number"
        if (favNumber > 12){
            System.out.println("That's a large number!");
        }
        if (favNumber < 12){
            System.out.println("That's a small number.");
        }

        //alternative way of doing this

        if (favNumber > 12){
            System.out.println("That's a large number!");
        }else{
            System.out.println("That's a small number.");
        }

        // Go to the rectangle class and implement the isSquare method
        // following the JavaDoc specs
    }
}
