public class VariablesTheme {
    public static void main(String[] args) {
        // 1 ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА
        System.out.println("1 ВЫВОД ХАРАКТЕРИСТИК КОМПЬЮТЕРА\n");

        // Количество ядер процессора
        byte cpuCores = 24;
        System.out.println("Количество ядер процессора: " + cpuCores);

        // Объем оперативной памяти в ГБ
        short ramSizeGb = 64;
        System.out.println("Объем оперативной памяти: " + ramSizeGb + " ГБ");

        // Объем SSD в ГБ
        int ssdSizeGb = 512;
        System.out.println("Объем SSD: " + ssdSizeGb + " ГБ");

        // Количество байт, доступных на диске (в условных единицах)
        long availableDiskBytes = 500_000_000_000L;
        System.out.println("Доступно на диске: " + availableDiskBytes + " байт");

        // Частота процессора в ГГц
        float cpuFrequency = 4.8f;
        System.out.println("Частота процессора: " + cpuFrequency + " ГГц");

        // Максимальная частота процессора
        double maxCpuFrequency = 5.8;
        System.out.println("Максимальная частота процессора: " + maxCpuFrequency + " ГГц");

        // Буква системного диска
        char systemDrive = 'C';
        System.out.println("Системный диск: " + systemDrive + ":");

        // Компьютер включен?
        boolean isComputerOn = true;
        System.out.println("Компьютер включен: " + isComputerOn + "\n");


        // 2 РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ
        System.out.println("2 РАСЧЕТ СТОИМОСТИ ТОВАРА СО СКИДКОЙ\n");

        short penPrice = 350;
        short bookPrice = 5000;
        byte totalDiscount = 15;

        // Общая стоимость без скидки
        float totalPrice = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки: " + totalPrice + " тг.");

        // Сумма скидки
        float discountAmount = totalPrice * totalDiscount / 100;
        System.out.println("Сумма скидки: " + discountAmount + " тг.");

        // Итоговая стоимость со скидкой
        float discountedPrice = totalPrice - discountAmount;
        System.out.println("Стоимость товаров со скидкой: " + discountedPrice + " тг." + "\n");


        // 3 ВЫВОД СЛОВА JAVA
        System.out.println("3 ВЫВОД СЛОВА JAVA\n");

        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a" + "\n");


        // 4 ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ
        System.out.println("4 ВЫВОД MIN И MAX ЗНАЧЕНИЙ ЦЕЛЫХ ЧИСЛОВЫХ ТИПОВ\n");

        // Переменная - byte
        byte maxByte = 127;
        System.out.println("Максимальное значение byte: " + maxByte);
        maxByte++;
        System.out.println("Значение byte после инкремента: " + maxByte);
        maxByte--;
        System.out.println("Значение byte после декремента: " + maxByte + "\n");

        // Переменная - short
        short maxShort = 32767;
        System.out.println("Максимальное значение short: " + maxShort);
        maxShort++;
        System.out.println("Значение short после инкремента: " + maxShort);
        maxShort--;
        System.out.println("Значение short после декремента: " + maxShort + "\n");

        // Переменная - int
        int maxInt = 2147483647;
        System.out.println("Максимальное значение int: " + maxInt);
        maxInt++;
        System.out.println("Значение int после инкремента: " + maxInt);
        maxInt--;
        System.out.println("Значение int после декремента: " + maxInt + "\n");

        // Переменная - long
        long maxLong = 9223372036854775807L;
        System.out.println("Максимальное значение long: " + maxLong);
        maxLong++;
        System.out.println("Значение long после инкремента: " + maxLong);
        maxLong--;
        System.out.println("Значение long после декремента: " + maxLong + "\n");

        // Переменная - char
        char maxChar = 65535;
        System.out.println("Максимальное значение char: " + (int) maxChar);
        maxChar++;
        System.out.println("Значение char после инкремента: " + (int) maxChar);
        maxChar--;
        System.out.println("Значение char после декремента: " + (int) maxChar + "\n");


        // 5 ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ
        System.out.println("5 ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ПЕРЕМЕННЫХ\n");

        // Исходные значения
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения: a = " + a + ", b = " + b + "\n");

        // С помощью третьей переменной
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("a = " + a + ", b = " + b + "\n");

        // С помощью арифметических операций
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Перестановка с помощью арифметических операций:");
        System.out.println("a = " + a + ", b = " + b + "\n");

        // С помощью побитовой операции XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Перестановка с помощью побитовой операции ^:");
        System.out.println("a = " + a + ", b = " + b + "\n");


        // 6 ВЫВОД СИМВОЛОВ И ИХ КОДОВ
        System.out.println("6 ВЫВОД СИМВОЛОВ И ИХ КОДОВ\n");

        // Объявление переменных типа char
        char dollar = '$';
        char asterisk = '*';
        char at = '@';
        char caret = '^';
        char tilde = '~';

        // Вывод кодов и символов
        System.out.println("Код символа: " + (int) dollar + " - Символ: " + dollar);
        System.out.println("Код символа: " + (int) asterisk + " - Символ: " + asterisk);
        System.out.println("Код символа: " + (int) at + " - Символ: " + at);
        System.out.println("Код символа: " + (int) caret + " - Символ: " + caret);
        System.out.println("Код символа: " + (int) tilde + " - Символ: " + tilde + "\n");


        // 7 ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА
        System.out.println("7 ВЫВОД В КОНСОЛЬ ASCII-АРТ ДЮКА\n");

        // Объявление уникальных символов
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openParen = '(';
        char closeParen = ')';

        // Вывод арта
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + openParen + " " + closeParen + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + "____" + slash + backslash + "__" + backslash + "\n");


        // 8 МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА
        System.out.println("8 МАНИПУЛЯЦИИ С СОТНЯМИ, ДЕСЯТКАМИ И ЕДИНИЦАМИ ЧИСЛА\n");

        int number = 123;

        // Получение сотен, десятков и единиц
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        // Сумма и произведение цифр
        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;

        // Вывод результата
        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + units);
        System.out.println("Сумма разрядов = " + sum);
        System.out.println("Произведение разрядов = " + product + "\n");


        // 9 ПЕРЕВОД СЕКУНД В ЧАСЫ, МИНУТЫ И СЕКУНДЫ
        System.out.println("9 ПЕРЕВОД СЕКУНД В ЧАСЫ, МИНУТЫ И СЕКУНДЫ\n");

        int totalSeconds = 86399;

        int hh = totalSeconds / 3600;
        int mm = (totalSeconds % 3600) / 60;
        int ss = totalSeconds % 60;

        System.out.println("Исходное количество секунд: " + totalSeconds);
        System.out.println("Время в формате ЧЧ:ММ:СС - " + hh + ":" + mm + ":" + ss + "\n");
    }
}