/*
Задача №2
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.

Задача №3
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.

Задача №5
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.

Задача №6
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.

Задача №7
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
 */
public class HW7_1 {
    /*
    Задача №1,2,3
    Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.
     */
    /* //Задача №1,2,3
    public static void main(String[] args) {
        int[] array = {9, -2, 6, 4, 5, 55, 7, 8, 6};

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if (min > array[i]){
                min = array[i];
            } if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
    */

//Задача №4
//Дан массив:
//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//необходимо вывести среднее арифметическое всех значений массива.
    /*
       public static void main(String[] args) {
        int[] array = {11, 2, 3, 4, 5, 6, 7, 8, 10};

        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
     */

    //Задача №5,6,7
    public static void main(String[] args){

    /*
       int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

       int sum = 0;
       for (int i = 0; i < array.length; i++){
           for (int j = 0; j < array[i].length; j++) {
               sum += array[i][j];
           }
       }
        System.out.println(sum);
  }
     */
        /*
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
   }
   */
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;
        for (int i = 0; i < array.length; i++){
          //  for (int j = 0; j < array[i].length; j++) {
              //  count++;
            count += array[i].length;
                }
          //  }

        System.out.println(count);
    }

}

