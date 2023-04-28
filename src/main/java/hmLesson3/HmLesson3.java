package hmLesson3;
import java.util.*;

public class HmLesson3 {
    public static void main(String[] args) {
        ex2_2();
//        ex1();
//        ex2();
    }


    /* 1. Создать список типа ArrayList<String>.
          Поместить в него как строки, так и целые числа.
          Пройти по списку, найти и удалить целые числа.

          Пример: {"Яблоко", "11", "13", "ДыняАпельсин", "", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    */
    private static void ex1() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "ДыняАпельсин", "", "17"));
        for (int i = 1; i < list.size(); i++) {
            try
            {
                int j = Integer.parseInt(list.get(i).trim());
                System.out.println(j);
                list.remove(list.get(i));
                i = i - 1;
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }
        }
        System.out.println(list);
    }

    /* 2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
          что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
          Напишите метод для заполнения данной структуры(можно через консоль).
          Пример:
                "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
                "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
                "Детектив", "Десять негритят".
                "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
    */
    private static void ex2() {
        List<ArrayList<String>> catalog = new ArrayList<>();
        ArrayList<String> internalList = new ArrayList<>();
        String book = "";
        String genre ="";
        System.out.println("Для завершения оставьте пустыми жанр и книгу.");
        do {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите жанр: ");
            genre = iScanner.nextLine();
            System.out.printf("Введите книгу: ");
            book = iScanner.nextLine();
            if (internalList.contains(genre)) {
                internalList.add(book);
            } else {
                catalog.add(internalList);
                internalList = new ArrayList<>();
                internalList.add(genre);
                internalList.add(book);
            }
        } while (!book.isEmpty() || !genre.isEmpty());
        catalog.remove(catalog.get(0));
        for (ArrayList item: catalog) {
            String replace = Arrays.toString(item.toArray()).replace("[", "").replace("]", "");
            System.out.print(replace + ".");
            System.out.println();
        }
    }


    //    3. Доделать задание 2.2 участникам семинара:
//    Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
    private static void ex2_2() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        List<String> noRepeat = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        System.out.println(randomSolarSystem);
        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);

        for (int i = 1; i < randomSolarSystem.size(); i++) {
            if (randomSolarSystem.get(i).equals(randomSolarSystem.get(i - 1))) {
                randomSolarSystem.remove(randomSolarSystem.get(i));
                i = i - 1;
            }
        }
        System.out.println(randomSolarSystem);
    }
}
