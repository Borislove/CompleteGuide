package chapter_6;

/*
class имя_класса{
тип переменная_экземпляра1:
тип переменная_экземпляра2:

тип имя_метода(список_параметров){
//тело метода
}
 */

//Программа, использующая класс Box
//Присвоить исходному файлу имя BoxDemo.java
public class Box {

    double width; //ширина
    double height; //высота
    double depth; //глубина
}

//В этом классе объявляется объект типа Box
class BoxDemo {

    public static void main(String[] args) {

        Box mybox = new Box(); //создать объект mybox класса Box
        double vol;
        //присвоить знчение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //рассчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
