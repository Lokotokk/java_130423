package hmLesson6;

import java.util.*;

public class Main {

//    1. Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
//    2. Создать множество ноутбуков.
//    3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//       отвечающие фильтру.
//       Критерии фильтрации можно хранить в Map. Например:
//            “Введите цифру, соответствующую необходимому критерию:
//            1 - ОЗУ
//            2 - Объём ЖД
//            3 - Операционная система
//            4 - Цвет …
//    4. Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации
//       можно также в Map.
//    5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


    public static void main(String[] args) {

        Notebook notebook = new Notebook("Honor MagicBook X 15", "Honor", "China",
                "Windows 11 home", "white", 4, 512, "8Гб", 15.6,
                1.6, 35.8, 22.9);
        Notebook notebook1 = new Notebook("Lenovo IdeaPad 3",  "Lenovo", "China",
                "Windows 11 pro", "grey", 2, 256, "8Гб", 15.6,
                2.0, 36.2, 25.3);
        Notebook notebook2 = new Notebook("Lenovo V15 G1 IML","Lenovo", "China",
                "Windows 10 Pro", "black", 4, 256, "8Гб", 15.6,
                1.9, 36.2, 25.1);
        Notebook notebook3 = new Notebook("Apple MacBook Pro 16","Apple", "USA",
                "macOS", "grey", 10, 512, "16Гб", 14.2,
                1.6, 31.3, 22.1);
        Notebook notebook4 = new Notebook("Apple MacBook Air 13 M2", "Apple", "USA",
                "macOS", "starlight", 8, 512,"8Гб", 13.6,
                1.6, 35.2, 21.5);
        Notebook notebook5 = new Notebook("Irbis NB280", "Irbis", "Russia",
                "Windows 10 home", "white", 2, 128, "4Гб", 15.6,
                2.3, 36.5, 22.7);
        Notebook notebook6 = new Notebook("VAIO NE15V2IN068P", "VAIO", "Japan",
                "Windows 11 home", "silver", 2, 512, "8Гб", 16.0,
                2.4, 35.9, 23.9);
        Notebook notebook7 = new Notebook("Irbis 15NBC1007", "Irbis", "Russia",
                "Windows 11 Pro", "blue", 6, 256, "16Гб", 15.6,
                1.9, 35.9, 23.4);
        Notebook notebook8 = new Notebook("Xiaomi RedmiBook 15 JYU4532RU", "Xiaomi", "China",
                "Windows 11 home", "black", 4, 512, "8Гб", 16.0,
                1.9, 36.3, 24.3);
        Notebook notebook9 = new Notebook("VAIO NE15V2IN067P", "VAIO", "Japan",
                "Windows 11 pro", "black", 2, 512, "8Гб", 15.6,
                2.4, 35.9, 23.9);
        Notebook notebook10 = new Notebook("Irbis 14NBC0002", "Irbis", "Russia",
                "Windows 11 Pro", "blue", 4, 256, "16Гб", 14.0,
                1.9, 32.4, 21.3);

        Set<Notebook> notebooks = new HashSet<Notebook>();
        notebooks.add(notebook);
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);
        for (Notebook item: notebooks) {
            System.out.println(item);
        }

        filter(notebooks);
    }

    private static void filter(Set<Notebook> notebooks) {
        Map<Integer, String> selectionСriteria = Map.ofEntries(
                Map.entry(1, "brand"),
                Map.entry(2, "country"),
                Map.entry(3, "operatingSystem"),
                Map.entry(4, "color"),
                Map.entry(5, "numberOfСores"),
                Map.entry(6, "ssdVolume"),
                Map.entry(7, "ram"),
                Map.entry(8, "screenDiagonal")
        );

        Map<String, String> criteria = new HashMap<>();
        criteria.put("Honor", "brand");
        criteria.put("Lenovo", "brand");
        criteria.put("Apple", "brand");
        criteria.put("Irbis", "brand");
        criteria.put("VAIO", "brand");
        criteria.put("Xiaomi", "brand");

        criteria.put("China", "country");
        criteria.put("USA", "country");
        criteria.put("Russia", "country");
        criteria.put("Japan", "country");

        criteria.put("Windows 11 home", "operatingSystem");
        criteria.put("Windows 11 pro", "operatingSystem");
        criteria.put("Windows 10 Pro", "operatingSystem");
        criteria.put("Windows 10 home", "operatingSystem");
        criteria.put("macOS", "operatingSystem");

        criteria.put("white", "color");
        criteria.put("grey", "color");
        criteria.put("black", "color");
        criteria.put("starlight", "color");
        criteria.put("silver", "color");
        criteria.put("blue", "color");

        criteria.put("512", "ssdVolume");
        criteria.put("256", "ssdVolume");
        criteria.put("128", "ssdVolume");

        criteria.put("4Гб", "ram");
        criteria.put("8Гб", "ram");
        criteria.put("16Гб", "ram");

        criteria.put("15.6", "screenDiagonal");
        criteria.put("14.2", "screenDiagonal");
        criteria.put("13.6", "screenDiagonal");
        criteria.put("16.0", "screenDiagonal");
        criteria.put("14.0", "screenDiagonal");

        Map<Integer, String> criteriaInt = new HashMap<>();
        criteriaInt.put(4, "numberOfСores");
        criteriaInt.put(2, "numberOfСores");
        criteriaInt.put(10, "numberOfСores");
        criteriaInt.put(8, "numberOfСores");
        criteriaInt.put(6, "numberOfСores");

        System.out.println("\n" + "1 - brand" +"\n" + "2 - country" + "\n" + "3 - operatingSystem"
                            +"\n" + "4 - color" + "\n" + "5 - numberOfСores"
                            +"\n" + "6 - ssdVolume" + "\n" + "7 - ram" + "\n" + "8 - screenDiagonal");
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");

        Scanner scanner = new Scanner(System.in);
        int ctiteriaNumber = scanner.nextInt();
        String criterianValue = selectionСriteria.get(ctiteriaNumber);

        if (criterianValue.equals("numberOfСores")) {
            for (Map.Entry<Integer, String> entry: criteriaInt.entrySet()) {
                if (entry.getValue().equals(criterianValue)) {
                    System.out.printf("%s%n", entry.getKey());
                }
            }

            System.out.println("Введите значение критерия для фильтрации: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            for(Notebook item: notebooks) {
                if (item.getNumberOfСores() == choice) {
                    System.out.println(item);
                }
            }
        } else {

            for (Map.Entry<String, String> entry: criteria.entrySet()) {
                if (entry.getValue().equals(criterianValue)) {
                    System.out.printf("%s%n", entry.getKey());
                }
            }

            System.out.println("Введите значение критерия для фильтрации: ");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();

            for (Notebook item: notebooks) {
                if (item.toString().contains(choice)) {
                    System.out.println(item);
                }
            }
        }
    }
}
