import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a variable between 1 & 5:");
        int grade = input.nextInt();

        /* The switch statement is used when there are specific
        * values to check for like the example below
        * we are checking if the user inputs a number between 1 and 5 */
        switch (grade) {
            case 1:
                System.out.println("The value is one");
                break;
            case 2:
                System.out.println("The value is two");
                break;
            case 3:
                System.out.println("The value is three");
                break;
            case 4:
                System.out.println("The value is four");
                break;
            case 5:
                System.out.println("The value is five");
                break;
        }
    }
}
