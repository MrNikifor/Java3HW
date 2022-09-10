package Java3.lesson1;
/*
3. Задание.
 */
public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println("Weight of apple is: " + apple.getWight());
        System.out.println("Weight of orange is: " + orange.getWight());

        orangeBox.info();

        appleBox.info();

        appleBox1.info();

        System.out.println();

        System.out.println("Is boxes equals? " + orangeBox.compare(appleBox));

        System.out.println();

        orangeBox.info();
        orangeBox1.info();
        System.out.println();
        System.out.println("Move fruits");
        orangeBox.moveFruits(orangeBox1);
        orangeBox.info();
        orangeBox1.info();
    }

}
