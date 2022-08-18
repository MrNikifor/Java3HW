package Java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
2. Написать метод, который преобразует массив в ArrayList;
 */
public class Trans {
    public static void main(String[] args) {
        String[] array = {"Hello", "Goodbye", "SeeYou", "Ever", "Never"};

        List<String> arrayList = convertToList(array);

        System.out.println(arrayList.getClass() + " " + arrayList);


    }
    public static <T> List convertToList(T[] array){
        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }
}
