package hmLesson4;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class HmLesson4 {
    public static void main(String[] args) {
//        ex01();
        ex02();
    }

    // 1. Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.

    private static void ex01() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> stringList = new LinkedList<>();
        while (true) {
            System.out.print("Введите строку: ");
            String inputStringUser = in.nextLine();
            String inputString = inputStringUser.toLowerCase();
            if (inputString.trim().length() == 0) {
                System.out.println("Строка не должна быть пустой");
            }
            else if (inputString.equals("арресто моментум")) {
                System.out.println(stringList);
                break;
            }
            else if (inputString.equals("print")) {
                for (int i = stringList.size() - 1; i >= 0; i--) {
                    System.out.println(stringList.get(i));
                }
            }
            else if (inputString.equals("revert")) {
                System.out.printf("удалено %s %n", stringList.get(stringList.size() - 1));
                stringList.remove(stringList.size()-1);
            } else {
                stringList.add(inputString);
            }
        }
    }

//    2. Пусть дан LinkedList с несколькими элементами.
//       Реализуйте метод, который вернет “перевернутый” список.
    private static void ex02() {
        Scanner sc = new Scanner(System.in);
        String userInput;
        int count = 0;
        boolean isNotCorrect = true;

        while(isNotCorrect) {
            System.out.println("Введите количество элементов списка: ");
            userInput = sc.next();
            try {
                count = Integer.parseInt(userInput);
                isNotCorrect = false;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число");
            }
        }

        List<String> list = addElements(count);
        System.out.println(list);
        int num = list.size() / 2;
        String temp = "";
        for (int i = 0; i < list.size(); i++) {
            if (i > num) {
                break;
            } else {
                temp = list.get(i);
                list.set(i, list.get(list.size() - i - 1));
                list.set(list.size() - i - 1, temp);
            }
        }
        System.out.println(list);
    }

    private static List<String> addElements(int count) {
        List<String> userList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите элемент списка: ");
            userList.add(iScanner.nextLine());
        }
        return userList;
    }
}
