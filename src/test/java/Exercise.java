import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        int x = 7, y = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Choose your operation: 1 for addition, 2 for subtraction, 3 for multiplication");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
        }

    }
}
