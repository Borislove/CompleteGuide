package chapter_6;

//примеры методов
public class Square {

    //метод без параметров
    static int square1() {
        return 10 * 10;
    }

    //метод с параметром
    static int square2(int i) {
        return i * i;
    }

    public static void main(String[] args) {

        int x, y;

        x = Square.square2(5); //x равно 25
        System.out.println(x);
        x = Square.square2(9); //x равно 81
        System.out.println(x);
        y = 2;
        x = square2(y);//x равно 4
        System.out.println(x);

        System.out.println("square1 = " + square1());
    }
}
