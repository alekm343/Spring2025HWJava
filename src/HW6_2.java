/*Задача №2
Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.
 */

public class HW6_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int count = 0;
       // for (int i = 0; i < s.length(); i++){
        for (char c : s.toCharArray()){ // или это
            //char c = s.charAt(i);
            if (c == 'е'){
                count++;
            }

        }
        System.out.println(count);
    }

}
