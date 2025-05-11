public class Calculator {

    public void calculate(int firstNumber, int secondNumber, char sign) {
        switch (sign) {
            case '+':
                System.out.println("Результат: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Результат: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Результат: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    System.out.println("Результат: " + (firstNumber / secondNumber));
                }
                break;
            case '%':
                if (secondNumber == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    System.out.println("Результат: " + (firstNumber % secondNumber));
                }
                break;
            case '^':
                System.out.println("Результат: " + pow(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Ошибка: операция '" + sign + "' не поддерживается");
        }
    }

    private double pow(int base, int exponent) {
        double result = 1.0;

        if (exponent == 0) {
            return 1.0;
        }

        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        }

        if (exponent < 0) {
            for (int i = 0; i < -exponent; i++) {
                result *= base;
            }
            result = 1.0 / result;
        }

        return result;
    }
}