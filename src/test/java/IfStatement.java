import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age: ");
        age = input.nextInt();

        if (age > 18) {
            System.out.println("You are eligible to enter this website");
        }
        else {
            System.out.println("Sorry!! You are not eligible to enter this website");
        }
    }
}
