public class IfElseStatementTheme {
    public static void main(String[] args) {

        // 1 Задание
        System.out.println("\n1. Перевод псевдокода на язык JAVA\n");

        boolean isMale = false;
        if (!isMale) {
            System.out.println("Пол: женский");
        } else {
            System.out.println("Пол: мужской");
        }

        int age = 30;
        if (age > 18) {
            System.out.println("Возраст: больше 18 лет");
        } else {
            System.out.println("Возраст: 18 лет или меньше");
        }

        double height = 1.6;
        if (height < 1.8) {
            System.out.println("Рост: ниже 1.8 м");
        } else {
            System.out.println("Рост: 1.8 м или выше");
        }

        // 2 Задание
        System.out.println("\n2. Поиск большего числа шагов\n");

        int stepsYesterday = 12500;
        int stepsToday = 12500;
        if (stepsToday > stepsYesterday) {
            System.out.println("Сегодня был более активен: " + stepsToday + " шагов");
        } else if (stepsYesterday > stepsToday) {
            System.out.println("Вчера был более активен: " + stepsYesterday + " шагов");
        } else {
            System.out.println("Одинаковая активность: " + stepsToday + " шагов");
        }
        int avgSteps = (stepsYesterday + stepsToday) / 2;
        System.out.println("Среднее количество шагов: " + avgSteps);

        // 3 Задание
        System.out.println("\n3. Проверка количества гостей\n");

        int guestsNum = -5;
        if (guestsNum < 0) {
            System.out.println("Ошибка: количество гостей не может быть отрицательным.");
        } else {
           if (guestsNum == 0) {
              System.out.println("Пока никто не записался на мероприятие!");
           } else if (guestsNum % 2 == 0) {
              System.out.println("Записалось " + guestsNum + " гостей. Можно формировать пары для конкурсов.");
           } else {
              System.out.println("Записалось " + guestsNum + " гостей. Нужны индивидуальные задания.");
           }
       }

        // 4 Задание
        System.out.println("\n4. Инвентаризация\n");

        int serialFromDb = 919;
        int actualSerial = 909;
        if (serialFromDb == actualSerial) {
            System.out.println("[№" + serialFromDb + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            int dbHundreds = serialFromDb / 100;
            int dbTens = (serialFromDb / 10) % 10;
            int dbUnits = serialFromDb % 10;

            int actualHundreds = actualSerial / 100;
            int actualTens = (actualSerial / 10) % 10;
            int actualUnits = actualSerial % 10;

            if (dbHundreds == actualHundreds || dbTens == actualTens || dbUnits == actualUnits) {
                System.out.println("Нет полного совпадения:");
                System.out.println("База данных: [№" + serialFromDb + "]");
                System.out.println("Фактический: [№" + actualSerial + "]");
            } else {
                System.out.println("[№" + actualSerial + "]: оборудование не идентифицировано");
            }
        }

        // 5 Задание
        System.out.println("\n5. Определение первого символа никнейма\n");

        String nickname = "Dmitry36";

        char firstChar = nickname.charAt(0);

        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы '" + firstChar + "' (С помощью диапазона кодов)");
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println("Имя " + nickname + " начинается с большой буквы '" + firstChar + "' (С помощью диапазона кодов)");
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println("Имя " + nickname + " начинается с цифры '" + firstChar + "' (С помощью диапазона кодов)");
        } else {
            System.out.println("Имя " + nickname + " начинается с символа '" + firstChar + "' (С помощью диапазона кодов)");
        }

        if (Character.isLowerCase(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы '" + firstChar + "' (С помощью Character)");
        } else if (Character.isUpperCase(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с большой буквы '" + firstChar + "' (С помощью Character)");
        } else if (Character.isDigit(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с цифры '" + firstChar + "' (С помощью Character)");
        } else {
            System.out.println("Имя " + nickname + " начинается с символа '" + firstChar + "' (С помощью Character)");
        }

        // 6 Задание
        System.out.println("\n6. Подсчёт начисленных банком %\n");

        double deposit = 321123.59;
        double interestRate;
        if (deposit < 100000) {
            interestRate = 0.05;
        } else if (deposit <= 300000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.10;
        }

        double interest = deposit * interestRate;
        double total = deposit + interest;
        System.out.printf("Сумма вклада: %.2f руб.\n", deposit);
        System.out.printf("Начисленный процент: %.2f руб.\n", interest);
        System.out.printf("Итоговая сумма с процентами: %.2f руб.\n", total);

        // 7 Задание
        System.out.println("\n7. Определение оценки по предметам\n");

        int historyPercent = 59;
        int programmingPercent = 92;

        int historyGrade;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        int programmingGrade;
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);

        double avgGrade = (historyGrade + programmingGrade) / 2.0;
        double avgPercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("Средний балл: " + avgGrade);
        System.out.println("Средний процент: " + avgPercent + "%");

        // 8 Задание
        System.out.println("\n8. Расчёт годовой прибыли\n");

        double monthlyRevenue = 13025.233;
        double monthlyRent = 5123.018;
        double monthlyCost = 9001.729;

        double monthlyProfit = monthlyRevenue - monthlyRent - monthlyCost;
        double yearlyProfit = monthlyProfit * 12;

        System.out.print("Прибыль за год: ");
        if (yearlyProfit > 0) {
            System.out.printf("+%.2f руб.\n", yearlyProfit);
        } else if (yearlyProfit < 0) {
            System.out.printf("%.2f руб.\n", yearlyProfit);
        } else {
            System.out.println("0 руб.");
        }
    }
}