package hmLesson1;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class hmLesson1 {
    /* 1. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    */
    public static void main(String[] args) {
//        task1(3, 5);
//        task2(new int[]{10, 4, 0, 10, 1});
//        task3(new int[10][10]);
        task4();

    }

    private static void task1(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /* 2. Задать одномерный массив и найти в нем минимальный и максимальный элементы */

    private static void task2(int[] arr) {
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
        System.out.println(maxValue);
    }
    /* Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], …, [n][n];*/
    // Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);

    private static void task3(int[] array[]) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            j = array.length - i - 1;
            array[i][j] = 1;
        }
        for (int[] line : array) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }

    /*В консоли запросить имя пользователя.
    В зависимости от текущего времени, вывести приветствие вида:
    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    "Доброй ночи, <Имя>!", если время от 23:00 до 4:59 */
    private static void task4() {
        LocalDateTime time = LocalDateTime.now();
        Calendar calendar = new GregorianCalendar();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите ваше имя: ");
        String name = iScanner.nextLine();
        iScanner.close();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
