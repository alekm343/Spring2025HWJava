/*
Задача №3
Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
●	использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
●	без использования конструкции if (шаг цикла на ваше усмотрение).
 */
public class HW4_3 {
    /*
    public static void main(String[] args) {
        for (int i = 40; i <= 60; i++ ){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
     */
    public static void main(String[] args) {
      for (int i = 40; i <= 60; i += 2){
          System.out.println(i);
      }
    }

}
