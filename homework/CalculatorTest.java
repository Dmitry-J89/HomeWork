public class CalculatorTest {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String answer;

        do {
            System.out.print("Введите первое число: ");
            int a = scan.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char sign = scan.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scan.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(a, b, sign);

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.next();

            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Введите корректный ответ [yes/no]: ");
                answer = scan.next();
            }

        } while (answer.equals("yes"));

        scan.close();
    }
}