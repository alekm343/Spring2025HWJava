/* Задача №3
Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
 */
public class HW6_3 {
    /*
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        String lowered = s.toLowerCase();
        String searchString = "рит";
            int lastFound = lowered.indexOf("рит");
            while (lastFound > -1){
            System.out.println(lastFound);
            lastFound = lowered.indexOf(searchString, lastFound + 1);
        }
    }
     */
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        String lowered = s.toLowerCase();
        String searchString = "рит";

        for (
             int lastFound = lowered.indexOf(searchString);
             lastFound > -1;
             lastFound = lowered.indexOf(searchString, lastFound + 1)
        ){
            System.out.println(lastFound);
        }

    }
}
