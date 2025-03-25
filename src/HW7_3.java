/*Задача №1
Необходимо написать 4 метода:
●	сложение 2х чисел
●	вычитание 2х чисел
●	умножение 2х чисел
●	деление 2х чисел

Задачи №2
https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
 */
public class HW7_3 {
    /*
    // Given [34, -345, -1, 100] your solution will return -345
    public static int findSmallestInt(int[] args) {

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++ ) {
            if (result > args[i]) {
                result = args[i];
            }
        }
        return result;
    }
        public static void main(String[] args){

            int[] arr = {34, -345, -1, 100};
            System.out.println(findSmallestInt(arr));
        }
     */

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 0; i < num; i++ ) {
            result += i + 1 + " sheep...";

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

    }



