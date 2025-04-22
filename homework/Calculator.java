public class Calculator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;
        char sign = '^';
        int result;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
         } else {
            System.out.println("Unknown operator: " + sign);
            return;
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}