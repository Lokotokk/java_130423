package lesson6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lesson6 {
    public static void main(String[] args) {
//        int[] arr = getArray();
//        for (Integer item : arr) {
//            System.out.print(item + " ");
//        }
//        double pr = uniqueNumbersPercent(arr);
//        System.out.println(pr);

        Cat cat = new Cat(2, "Vasya", "persian", true);
        Cat cat1 = new Cat(3, "Leonid", "persian", true);
//        cat1.age = 3;
//        cat1.name = "Leonid";
//        cat1.breed = "persian";
//        cat1.isMale = true;
        Cat cat2 = new Cat(2, "Vasya", "persian", true);
//        cat2.age = 2;
//        cat2.name = "Vasya";
//        cat2.breed = "persian";
//        cat2.isMale = true;
        VetCat catVet = new VetCat(5, "Masha", "persian", false, "blanc", true);
//        catVet.name = "Masha";
//        catVet.age = 5;
//        catVet.breed = "persian";
//        catVet.isMale = false;
//        catVet.medicalHistory = "blanc";
//        catVet.isSterilized = true;
        VetCat catVet1 = new VetCat(7, "Pasha", "siams", true, "blanc", false);
//        catVet1.name = "Pasha";
//        catVet1.age = 7;
//        catVet1.breed = "siams";
//        catVet1.isMale = true;
//        catVet1.medicalHistory = "blanc";
//        catVet1.isSterilized = false;
        ShowCat catCat = new ShowCat(3, "Murka", "siams", false, 1, "flowers");
//        catCat.name = "Murka";
//        catCat.age = 3;
//        catCat.breed = "siams";
//        catCat.isMale = false;
//        catCat.place = 1;
//        catCat.showName = "flowers";
        TheatreCat theatreCat = new TheatreCat(2, "Leo", "angor", true, 55, "hight jump");
//        theatreCat.age = 2;
//        theatreCat.name = "Leo";
//        theatreCat.breed = "angor";
//        theatreCat.isMale = true;
//        theatreCat.groupId = 55;
//        theatreCat.capacity = "hight jump";

//        System.out.println(cat.toString());
//        System.out.println(cat1.toString());
//        System.out.println(cat2.toString());
//        System.out.println(cat.equals(cat2));

        Set<Cat> cats = new HashSet<Cat>();
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(catVet);
        cats.add(catVet1);
        cats.add(catCat);
        cats.add(theatreCat);
        System.out.println(cats);

    }

//    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//    2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
//    уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//    Для вычисления процента используйте формулу:
//    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

    private static int[] getArray() {
        int[] array = new int[10]; // задаём пустой массив размеом 1000 элементов.
        Random random = new Random(); // создаём объект для генерирования случайных чисел
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
        return array;
    }

    private static double uniqueNumbersPercent(int[] arr) {
        double unp = 0;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for (Integer item: arr) {
            System.out.print(item + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count ++;
            }
            else if (count == 0) {
                set.add(arr[i]);
            } else {
                count = 0;
            }
        }
        if (count == 0) {
            set.add(arr[arr.length - 1]);
        }
        System.out.println(set);
        unp = set.size() * 100 / arr.length;
        return unp;
    }

//    1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//    а) информационной системой ветеринарной клиники
//    б) архивом выставки котов
//    в) информационной системой Театра кошек Ю. Д. Куклачёва
//    Можно записать в текстовом виде, не обязательно реализовывать в java.

}
