package lesson3;
import java.util.*;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
//        ex01();
//        ex02();
//        ex02_1();
        ex03();

    }



    //    Задание №1
//    Заполнить список десятью случайными числами.
//    Отсортировать список методом sort() и вывести его на экран.
    private static void ex01() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        list.sort(Comparator.reverseOrder());
// Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);
    }


    /*
   Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
   Вывести название каждой планеты и количество его повторений в списке.
    String[] planetsNamesStringArray = {"Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto"};
    String[] planetsNamesStringArray = {"Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Pluto"};
    String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};*/
    private static void ex02() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        System.out.println(randomSolarSystem);
        randomSolarSystem.sort(Comparator.naturalOrder());
        randomSolarSystem.add(" ");
        System.out.println(randomSolarSystem);
        int count = 1;
        for (int i = 0; i < randomSolarSystem.size() - 1; i++) {
            if (randomSolarSystem.get(i).equals(randomSolarSystem.get(i + 1))) {
                count++;
            } else {
                System.out.println(randomSolarSystem.get(i));
                System.out.println(count);
                count = 1;
            }
        }
    }

    private static void ex02_1() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 16; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);
        randomSolarSystem.sort(Comparator.naturalOrder());
        int venus = randomSolarSystem.indexOf("Venus");
        System.out.println(venus);
        int uranus = randomSolarSystem.indexOf("Uranus");
        System.out.println(uranus);
        int mercury = randomSolarSystem.indexOf("Mercury");
        System.out.println(mercury);


  /*      int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < planetsNamesStringArray.length; i++) {
            count = 0;
            for (var item :
                    randomSolarSystem) {
                if (item.equals(planetsNamesStringArray[i])) {
                    count++;
                }
            }
            sb.append(planetsNamesStringArray[i]).append(": ").append(count).append("\n");
        }
        System.out.println(sb);*/
    }

    //    Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
    private static void ex03() {
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




/*        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);
        int earth = randomSolarSystem.indexOf("Earth");
        System.out.printf(earth);
        int jupiter = randomSolarSystem.indexOf("Jupiter");
        System.out.println(jupiter);
        int mars = randomSolarSystem.indexOf("Mars");
        System.out.println(mars);
        int mercury = randomSolarSystem.indexOf("Mercury");
        System.out.println(mercury);
        int neptune = randomSolarSystem.indexOf("Neptune");
        System.out.println(neptune);
        int pluto = randomSolarSystem.indexOf("Pluto");
        System.out.println(pluto);
        int saturn = randomSolarSystem.indexOf("Saturn");
        System.out.println(saturn);
        int uranus = randomSolarSystem.indexOf("Uranus");
        System.out.println(uranus);
        int venus = randomSolarSystem.indexOf("Venus");
        System.out.println(venus);*/
    }
}
