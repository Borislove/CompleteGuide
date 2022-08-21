package chapter_12;

//Воспользоваться встроенными в перечисление методами

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы перечислимого типа Apple:");

        //применить метод values()
        Apple allapples[] = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);

        //////////////////////////////////
        /*for(Apple a: Apple.values())
            System.out.println(a);*/

        System.out.println();

        //применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит "+ap);
    }
}
