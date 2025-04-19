public class CyclesTheme {
    public static void main(String[] args) {

        // 1 Задание
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int start = -10;
        int end = 21;
        int evenSum = 0;
        int oddSum = 0;
        int current = start;
        do {
            if (current % 2 == 0) {
                evenSum += current;
            } else {
                oddSum += current;
            }
            current++;
        } while (current <= end);
        System.out.println("В отрезке [" + start + ", " + end + "] сумма четных чисел = "
                + evenSum + ", а нечетных = " + oddSum);

        // 2 Задание
        System.out.println("\n2. Вывод чисел между min и max в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;

        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;

        System.out.print("Числа в интервале (" + min + ", " + max + ") в порядке убывания: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        // 3 Задание
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int number = 1234;
        int sum = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sum += digit;
            number /= 10;
        }
        System.out.println("\nСумма его цифр = " + sum);

        // 4 Задание
        System.out.println("\n4. Вывод чисел в несколько строк\n");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        int remainder = count % 5;
        if (remainder != 0) {
            for (int i = 0; i < 5 - remainder; i++) {
                System.out.printf("%3d", 0);
            }
        }

        // 5 Задание
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность\n");
        int targetNumber = 3242592; // Ок, теперь только по заданию, без отклонений!
        int temp = targetNumber;
        int twosCount = 0;
        while (temp > 0) {
            if (temp % 10 == 2) {
                twosCount++;
            }
            temp /= 10;
        }
        String parity = (twosCount % 2 == 0) ? "четное" : "нечетное";
        System.out.println("В " + targetNumber + " " + parity + " (" + twosCount + ") количество двоек");

        // 6 Задание
        System.out.println("\n6. Вывод геометрических фигур\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        int rows = 5;
        while (rows > 0) {
            for (int i = 0; i < rows; i++) {
                System.out.print("#");
            }
            System.out.println();
            rows--;
        }
        System.out.println();

        int iteration = 1;
        int printed = 0;
        int maxIterations = 5;
        int currentRowLength = 1;

        do {
            System.out.print("$");
            printed++;

            if (printed == currentRowLength) {
                System.out.println();
                iteration++;
                printed = 0;

                if (iteration <= 3) {
                    currentRowLength++;
                } else {
                    currentRowLength--;
                }
            }
        } while (iteration <= maxIterations);

        // 7 Задание
        System.out.println("\n7. Вывод ASCII-символов\n");
        System.out.printf(" %-7s   %-9s   %s\n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 33; i <= 41; i += 2) {
            System.out.printf("   %-3d         %-3c          %s\n", i, (char) i, Character.getName(i));
        }

        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("   %-3d         %-3c          %s\n", i, (char) i, Character.getName(i));
            }
        }

        // 8 Задание
        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        int original = 1234321;
        int reversed = 0;
        int copy = original;
        while (copy > 0) {
            reversed = reversed * 10 + copy % 10;
            copy /= 10;
        }
        if (original == reversed) {
            System.out.println("Число " + original + " - палиндром");
        } else {
            System.out.println("Число " + original + " - не палиндром");
        }

        // 9 Задание
        System.out.println("\n9. Проверка, является ли число счастливым\n");
        int luckyNumber = 123321;
        int leftSum = 0;
        int rightSum = 0;
        int part = luckyNumber;
        for (int i = 0; i < 3; i++) {
            rightSum += part % 10;
            part /= 10;
        }
        for (int i = 0; i < 3; i++) {
            leftSum += part % 10;
            part /= 10;
        }
        System.out.println("Число " + luckyNumber + " - "
                + (leftSum == rightSum ? "счастливое" : "не счастливое"));
        System.out.println("Сумма первых трёх цифр = " + leftSum);
        System.out.println("Сумма последних трёх цифр = " + rightSum);

        // 10 Задание
        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}