package Java3.lesson1;

import java.util.Arrays;
public class TwoElements {
    /*1. Задание.
 */
    public static void main(String[] args) {
            String[] array = {"Element1", "Element2", "Element3", "Element4"};

            System.out.println(Arrays.toString(array));
            changeArray(array, 0,2);
            System.out.println(Arrays.toString(array));
        }
        public static <T> void changeArray(T[] array, int i, int j){
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }
}
