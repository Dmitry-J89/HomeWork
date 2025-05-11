import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Введите первое число: ");
            int firstNumber = scan.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char sign = scan.next().charAt(0);

            System.out.print("Введите второе число: ");
            int secondNumber = scan.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(firstNumber, secondNumber, sign);

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.next().toLowerCase();

            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes/no]: ");
                answer = scan.next().toLowerCase();
            }

        } while (answer.equals("yes"));

        scan.close();
    }
}