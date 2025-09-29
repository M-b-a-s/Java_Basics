import java.util.Scanner;

class GetInput {
    public static void main(String[] args) {
        int test_total = 30;
        int exam_total = 100;
        int test_score;
        int exam_grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your total test grade: ");
        test_score = input.nextInt();

        System.out.println("Please enter your final exam grade: ");
        exam_grade = input.nextInt();

        int student_grade = test_score + exam_grade;
        int total = test_total + exam_total;
        double percentage = Math.floor((double) student_grade / total * 100);

        System.out.println("Your Total Grade: " + student_grade);
        System.out.println("Your percentage is: " + percentage + "%");

        input.close();
    }
}
