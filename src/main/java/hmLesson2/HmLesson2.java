package hmLesson2;
import java.io.File;

public class HmLesson2 {
    public static void main(String[] args) {
        hmTask1();
//        hmTask2("C:\\Users\\Алексей\\IdeaProjects\\java_practice23\\forHm2");
    }


    // 1. Дана строка sql-запроса "select * from students where ".
//    Сформируйте часть WHERE этого запроса, используя StringBuilder.
//    Данные для фильтрации приведены ниже в виде json-строки.
//    Если значение null, то параметр не должен попадать в запрос.
//    Пример 1:
//    Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
//    Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//    Пример 2:
//    Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
//    Результат: SELECT * FROM USER;
    private static void hmTask1() {
        String parameters = "{\"name:Ivanov\", \"country:Russia\", \"city:Moscow\", \"age:null}";
//        String parameters = "{\"name:Olga\", \"country:Russia\", \"city:null\", \"age:31}";
//        String parameters = "{\"name:null\", \"country:null\", \"city:null\", \"age:null\"}";
        parameters = parameters
                .replace("{", "")
                .replace("}", "")
                .replace("\"", "");
        String[] ar = parameters.split("\\W+");
        String first = "SELECT * FROM USER ";
        StringBuilder result = new StringBuilder(first);
        int count = 0;
        for (int j = 1; j < ar.length; j += 2) {
            if (!ar[j].equals("null")) {
                result.append(ar[j - 1])
                        .append(" = ")
                        .append("'")
                        .append(ar[j])
                        .append("'")
                        .append(" and ");
            } else {
                count++;
            }
        }
        if (count == 4) {
            result.insert(18, ";");
            System.out.println(result);
        } else {
            result.insert(18, " WHERE");
            int len = result.length() - 5;
            result.delete(len, result.length());
            result.append(";");
            System.out.println(result);
        }
    }

    //   2. Напишите метод, который определит тип (расширение) файлов из текущей папки
//      и выведет в консоль результат вида:
//       1 Расширение файла: txt
//       2 Расширение файла: pdf
//       3 Расширение файла:
//       4 Расширение файла: jpg
    private static void hmTask2(String pathDir) {
        File folder = new File(pathDir);
        if (!(folder.exists() || folder.isDirectory())) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String fileName : folder.list()) {
            String[] splitFileName = fileName.split("\\.");
            sb.append("Расширение файла: ").append(splitFileName[splitFileName.length - 1]).append("!");
        }
        String[] result = sb.toString().split("!");
        for (String item: result) {
            System.out.println(item);
        }
    }
}

