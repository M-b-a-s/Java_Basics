import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Rectangle kitchen = getRoom();
        Rectangle Bathroom = getRoom();

    }

    public Rectangle getRoom() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        scanner.close();
    }
}
