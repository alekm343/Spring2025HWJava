/* Задача №1
Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
 */

public class HW6_1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        //for (int i = 0; i < s.length(); i++){
        for (char c : s.toCharArray()){
            //char c = s.charAt(i);
            if (c == 'о'){
               // System.out.println(c);
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
