package lesson_2;

public class Lesson2 {
    //1 Метод выводит Orange, Banana, Apple.
    public static void main(String[] args) {
        System.out.println("Orange, Banana, Apple");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkInterval(123, 345);
        checkPositivity(0);
        checkPositivityTrue(12);
        // Примеры использования
        System.out.println(checkPositivityTrue(-5)); // true
        System.out.println(checkPositivityTrue(0));  // false
        System.out.println(checkPositivityTrue(10)); // false

        printString("Hello, World!", 3);
        yearChecker(0);
        System.out.println(yearChecker(2024)); // true
        System.out.println(yearChecker(1900)); // false
        System.out.println(yearChecker(2000)); // true
        System.out.println(yearChecker(2023)); // false
        arrayInversion();
        fillArray();
        array12();
        array13();
        array14();

    }


    // 1 Тоже вывод слов Orange, Banana, Apple.
    public static void printThreeWords() {
        String str1 = "Orange";
        String str2 = "Banana";
        String str3 = "Apple";
        String str4 = str1 + ", " + str2 + ", " + str3;
        System.out.println(str4);
    }

    // Метод выводит на экран положительна ли сумма.
    public static void checkSumSign() {
        int a = 10;
        int b = 5;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    //3 Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение "Красный",
    // если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то"Желтый",
    // если больше 100 (100 исключительно) - "Зеленый".

    public static void printColor() {
        int value = 123;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");

        } else {
            System.out.println("Зеленый");
        }

    }

    // 4 Метод compareNumbers(),если а больше или равно b, то выводит в консоль сообщение "a >= b",
    // в противном случае "a < b".
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //5 Проверяет находится ли сумма чисел в интервале [10,20].
    // @param a первое целое число;
    // @param b второе целое число;
    // @return в интервале или нет.

    public static boolean checkInterval(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //6 Метод  печатает в консоль, положительное число передали или отрицательное.
    public static void checkPositivity(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7 Метод возвращает  true, если число отрицательное, и false если положительное.
    //Замечание: ноль считаем положительным числом.
    public static boolean checkPositivityTrue(int number) {
        return number < 0;

        // Примеры использования
        //  System.out.println(isNegative(-5)); // true
        //   System.out.println(isNegative(0));  // false
        //  System.out.println(isNegative(10)); // false
    }

    //8 Метод печатает в консоль указанную строку, указанное количество раз.

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }


    //9 Метод определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).

    public static boolean yearChecker(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //10 С помощью цикла и условия заменить 0 на 1, 1 на 0.
    public static void arrayInversion() {
        int[] array = {1, 0, 1, 0, 0, 1, 1, 1, 0, 1};
        System.out.println("Исходный массив");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.println("Инвертированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();//для разделения заданий при выводе
        System.out.println();//для разделения заданий при выводе

    }

    //11 Заполнение массива с помощью цикла знамениями 1 2 3 4 5 6 7 8 ...100.

    public static void fillArray() {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }


        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();//для разделения заданий при выводе
        System.out.println();//для разделения заданий при выводе
    }

    // 12 В массиве числа меньшие 6 умножить на 2.
    public static void array12() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // Проходим по массиву циклом
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2; // Умножаем на 2
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();//для разделения заданий при выводе
        System.out.println();//для разделения заданий при выводе

    }


    // 13 С помощью цикла заполнить диагонали массива  единицами.
    public static void array13() {


        int[][] big = new int[10][10];

        for (int i = 0; i < big.length; i++) {
            for (int j = 0; j < big[i].length; j++) {
                if (i == j) {
                    big[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < big.length; i++) {
//            for (int j = big[i].length - 1; j >= 0; j--) {
            big[i][big[i].length - 1 - i] = 1;
//            }
        }

        for (int i = 0; i < big.length; i++) {
            for (int j = 0; j < big[i].length; j++) {
                System.out.print(big[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();//для разделения заданий при выводе

    }

    //14 Написать метод, возвращающий одномерный массив типа int длино len, каждая ячейка которого равна initialValue.
    public static void array14() {
        int[] result = createArray(3, 6);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;

    }


}