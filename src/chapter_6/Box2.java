package chapter_6;

//В этой программе объявляются два объекта класса Box2

public class Box2 {


    double width; //ширина
    double height; //высота
    double depth; //глубина

}

class BoxDemo2 {
    public static void main(String[] args) {

        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        Box2 mybox3; //объявить ссылку на объект
        mybox3 = new Box2(); //выделить память для объекта Box2
        double vol;

        //присвоить знчение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //рассчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        //рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}
