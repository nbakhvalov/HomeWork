package ru.geekbrains.homework;

import java.util.GregorianCalendar;
// Задание 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
public class Main {
    public static void main(String[] args) {

    }
    // Задание 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void task2() {  //psvm
        byte bt = 127; // -128 до 127!
        short sh = 2758;
        int i = 79542;
        long l = 278945623L;
        char ch = 'x';
        double db = 7.32;
        float fl = 9.71f;
        boolean boo = true;
        String str = "Текст";
        System.out.println("Байт = " + bt);
        System.out.println("Шорт = " + sh);
        System.out.println("Инт = " + i);
        System.out.println("Лонг = " + l);
        System.out.println("Чар = " + ch);
        System.out.println("Дабл = " + db);
        System.out.println("Флоут = " + fl);
        System.out.println("Булиан = " + boo);
        System.out.println("Стринг = " + str);
    }

    //Задание 3.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    static int task3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // Задание 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    static boolean task4(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20)
            return true ;
        else
            return false;
    }

    // Задание 5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.

    static void task5(int a) {
        if (a >= 0)
            System.out.println("Число " + a + "положительное!");
        else
            System.out.println("Число" + a + "отрицательное !");

    }

    // Задание 6. Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное;
    static boolean task6(int a) {
        if (a < 0)
            return true;
        else
            return false;
    }

    // Задание 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void task7(String name) {
        name = "указанное_имя"; //Введите имя
        System.out.println("Привет, " + name + " !");

    }

    //Задание 8. * Написать метод, который определяет является ли год високосным,
    // и выводит сообщение в консоль. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    public boolean isLeapYear(int year) {

        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();

        return cal.isLeapYear(year);
        // Ответ найден на https://www.codeflow.site/ru/article/java__java-how-to-calculate-leap-year
    }

}
