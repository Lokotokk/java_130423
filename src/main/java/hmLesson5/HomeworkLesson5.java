package hmLesson5;
import java.util.*;
import java.util.stream.Collectors;

public class HomeworkLesson5 {

    public static void main(String[] args) {
//        ex01();
//          ex02();
//        ex03();
        ex04();
    }


    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

    public static void ex01() {
        Map<String, ArrayList<String>> bookPhone = new HashMap<>();
        addElement("Ivanov", "274-10-01", bookPhone);
        addElement("Ivanov", "555-55-55", bookPhone);
        addElement("Petrova", "123-45-67", bookPhone);
        addElement("Belova", "789-67-45", bookPhone);
        addElement("Musina", "000-00-00", bookPhone);
        addElement("Petrova", "111-11-11", bookPhone);
        addElement("Krutova", "222-22-22", bookPhone);
        addElement("Chernov", "333-33-33", bookPhone);
        addElement("Petrova", "131-90-79", bookPhone);
        System.out.println(bookPhone);
    }
    public static void addElement(String key, String value, Map<String, ArrayList<String>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }


// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
    public static void ex02() {
        Map<String, Integer> namePeople = new HashMap<>();
        String[] staff = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };
        countName(staff, namePeople);
        sortedStaff(namePeople);

    }

    // Функция, считающая кол-во повторений имен сотрудников
    public static void countName(String[] people, Map<String, Integer> namePeople) {
        for (String person : people) {
            String name = person.split(" ")[0];
            if (namePeople.containsKey(name)) {
                namePeople.put(name, namePeople.get(name) + 1);
            } else {
                namePeople.put(name, 1);
            }
        }
    }

    // Функция сотртировки по убыванию популярности имени
    public static void sortedStaff(Map<String, Integer> namePeople) {
        Map<String, Integer> sortedName = namePeople.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedName.entrySet().forEach(System.out::println);
    }



// Реализовать алгоритм пирамидальной сортировки (HeapSort).

    public static void ex03() {
        int[] listNum = new int [] {5, 2, 3, 8, 10, 5, -1};
        heapsort(listNum);
        for(int el: listNum) System.out.printf("%d ", el);
    }

    public static int LEFT(int i) {
        return (2*i + 1);
    }


    public static int RIGHT(int i) {
        return (2*i + 2);
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int[] arr, int i, int size)
    {
        int left = LEFT(i);
        int right = RIGHT(i);

        int largest = i;

        if (left < size && arr[left] > arr[i]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i)
        {
            swap(arr, i, largest);
            heapify(arr, largest, size);
        }
    }

    public static int pop(int[] arr, int size)
    {
        if (size <= 0) {
            return -1;
        }
        int top = arr[0];
        arr[0] = arr[size-1];
        heapify(arr, 0, size - 1);

        return top;
    }

    public static void heapsort(int[] arr)
    {
        int n = arr.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(arr, i--, n);
        }

        while (n > 0)
        {
            arr[n - 1] = pop(arr, n);
            n--;
        }
    }

    private static void ex04() {
        int[] queens = new int[8];
        findPosition(0, queens);

        // Вывод доски в консоль
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("X");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }

    // Функция для поиска расстановки ферзей
    private static boolean findPosition(int row, int[] queens) {
        if (row == 8) { // Если удалось расставить всех 8 ферзей, вернуть true
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                // Проверка на наличие конфликта по вертикали, диагонали и антидиагонали
                if (queens[i] == col || queens[i] == col - row + i || queens[i] == col + row - i) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                queens[row] = col; // Сохранить расстановку ферзя в массив
                if (findPosition(row + 1, queens)) { // Рекурсивный вызов для следующего ряда
                    return true;
                }
            }
        }
        return false;
    }
}






    


    