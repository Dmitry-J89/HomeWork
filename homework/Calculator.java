public class Calculator {

    public void calculate(int a, int b, char sign) {
        switch (sign) {
            case '+':
                System.out.println("Результат: " + (a + b));
                break;
            case '-':
                System.out.println("Результат: " + (a - b));
                break;
            case '*':
                System.out.println("Результат: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    System.out.println("Результат: " + (a / b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    System.out.println("Результат: " + (a % b));
                }
                break;
            case '^':
                System.out.println("Результат: " + pow(a, b));
                break;
            default:
                System.out.println("Ошибка: операция '" + sign + "' не поддерживается");
        }
    }

    private double pow(int base, int exponent) {
        double result = 1.0;

        if (exponent == 0) {
            return 1.0;
        } else if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i < -exponent; i++) {
                result *= base;
            }
            result = 1.0 / result;
        }

        return result;
    }
}