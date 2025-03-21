/*
Задача №2
Необходимо вывести все положительные степени числа 5 до тех пор,
пока результат возведения в степень меньше 100000, вывести результат возведения в степень.
 */
public class HW4_2 {
    public static void main(String[] args) {
     /*
    int limit = 10000000;
    int base = 5;

    //for (int result = 1; result < limit; result = result * base){
        for (int result = 1; result < limit; result *= base ){
            System.out.println(result);
       }
      */
        int limit = 10000000;
        int base = 5;

        //int a = 0, b = 200;

        //int power =0;
        //for (int result = 1; result < limit; result = result * base){
        //for (int result = 0, power = 1; result < limit; result *= base ){
        //   System.out.println(base + "^" + power + "=" + result);
        //  power++;

        int result = 1, power =0;
        do {
            System.out.println(base + "^" + power + "=" + result);
            power++;
            result *= base;
        } while (result < limit);

        //  }
    }
}
