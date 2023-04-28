package lesson2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Lesson2 {
    public static void main(String[] args) {
//        example1();
//        example2();
        example3("C:\\Users\\Алексей\\IdeaProjects\\java_130423");
    }


    /*    Дано четное число N и символы A и B.
          Написать метод, который вернет строку длины N,
          которая состоит из чередующихся символов A и B, начиная с A.*/
    private static void example1() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            if (i == 0 || i % 2 == 0) {
//                sb.append("A");
//            } else {
//                sb.append("B");
//            }
//        }
//        System.out.println(sb);

//        Scanner cs = new Scanner(System.in);
//        System.out.print("Input amount of chars: ");
//        int amountOfChar = cs.nextInt();
//        String[] c= new String[] {"A","b"};
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < amountOfChar; i++) {
//            result.append(c[i % 2]);
//        }
//        System.out.println(result);

        char a = 'A';
        char b = 'b';
        int n = 5;
        String str = "" + a + b;
        str = str.repeat(n / 2) + ((n % 2 == 1) ? a : "");
        System.out.println(str);
    }

    /*  Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcdd. */

    private static void example2() {
        String trash = "aaaabbbcddYYYYYoooooo00000";
        StringBuilder result = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < trash.length() - 1; i++) {
            if (trash.charAt(i + 1) != trash.charAt(i)) {
                result.append(trash.charAt(i));
                if (counter != 1) {
                    result.append(counter);
                }
                counter = 0;
            }
            counter++;
        }
        result.append((trash.charAt(trash.length() - 1))).append(counter);
        System.out.println(result);
    }

//    Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//    Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//    Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

    private static void example3(String pathDir) {
        File file = new File(pathDir);
        if (!(file.exists() || file.isDirectory())) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String fileName : file.list()) {
            sb.append(fileName).append(System.lineSeparator());
        }
        System.out.println(sb);

        try (PrintWriter pw = new PrintWriter("src/main/resources/files/File.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
