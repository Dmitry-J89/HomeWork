public class IfElseStatementTheme {
    public static void main(String[] args) {

        // 1 ЗАДАНИЕ
        System.out.println("1 ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");

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

        System.out.println();

        // 2 ЗАДАНИЕ
        System.out.println("2 ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");

        int stepsYesterday = 7000;
        int stepsToday = 12500;
        if (stepsToday > stepsYesterday) {
            System.out.println("Сегодня был более активен: " + stepsToday + " шагов");
        } else if (stepsYesterday > stepsToday) {
            System.out.println("Вчера был более активен: " + stepsYesterday + " шагов");
        } else {
            System.out.println("Одинаковая активность");
        }
        int averageSteps = (stepsYesterday + stepsToday) / 2;
        System.out.println("Среднее количество шагов: " + averageSteps);

        System.out.println();

        // 3 ЗАДАНИЕ
        System.out.println("3 ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");

        int guests = 11;
        if (guests >= 0) {
            if (guests == 0) {
                System.out.println("Пока никто не записался на мероприятие!");
            } else if (guests % 2 == 0) {
                System.out.println("Записалось " + guests + " гостей. Можно формировать пары для конкурсов.");
            } else {
                System.out.println("Записалось " + guests + " гостей. Нужны индивидуальные задания.");
            }
        } else {
            System.out.println("Ошибка: количество гостей не может быть отрицательным.");
        }

        System.out.println();

        // 4 ЗАДАНИЕ
        System.out.println("4 ИНВЕНТАРИЗАЦИЯ");

        int dbSerial = 919;
        int actualSerial = 909;
        if (dbSerial == actualSerial) {
            System.out.println("[№" + dbSerial + "]: компьютер на 3-м этаже в кабинете 2");
        } else {
            int dbHundreds = dbSerial / 100;
            int dbTens = (dbSerial / 10) % 10;
            int dbUnits = dbSerial % 10;

            int actualHundreds = actualSerial / 100;
            int actualTens = (actualSerial / 10) % 10;
            int actualUnits = actualSerial % 10;

            if (dbHundreds == actualHundreds || dbTens == actualTens || dbUnits == actualUnits) {
                System.out.println("Нет полного совпадения:");
                System.out.println("База данных: [№" + dbSerial + "]");
                System.out.println("Фактический: [№" + actualSerial + "]");
            } else {
                System.out.println("[№" + actualSerial + "]: оборудование не идентифицировано");
            }
        }

        System.out.println();

        // 5 ЗАДАНИЕ
        System.out.println("5 ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");

        String nickname = "Dmitry36";

        char firstChar = nickname.charAt(0);

        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы '" + firstChar + "'" + "(С помощью ДИАПАЗОНА КОДОВ)");
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println("Имя " + nickname + " начинается с большой буквы '" + firstChar + "'" + "(С помощью ДИАПАЗОНА КОДОВ)");
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println("Имя " + nickname + " начинается с цифры '" + firstChar + "'" + "(С помощью ДИАПАЗОНА КОДОВ)");
        } else {
            System.out.println("Имя " + nickname + " начинается с символа '" + firstChar + "'" + "(С помощью ДИАПАЗОНА КОДОВ)");
        }

        System.out.println();

        if (Character.isLowerCase(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с маленькой буквы '" + firstChar + "'" + "(С помощью Character)");
        } else if (Character.isUpperCase(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с большой буквы '" + firstChar + "'" + "(С помощью Character)");
        } else if (Character.isDigit(firstChar)) {
            System.out.println("Имя " + nickname + " начинается с цифры '" + firstChar + "'" + "(С помощью Character)");
        } else {
            System.out.println("Имя " + nickname + " начинается с символа '" + firstChar + "'" + "(С помощью Character)");
        }

        System.out.println();

        // 6 ЗАДАНИЕ
        System.out.println("6 ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");

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
        
        System.out.println();

        // 7 ЗАДАНИЕ
        System.out.println("7 ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");

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

        double averageGrade = (historyGrade + programmingGrade) / 2.0;

        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Средний процент: " + averagePercent + "%");

        System.out.println();

        // 8 ЗАДАНИЕ
        System.out.println("8 РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");

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