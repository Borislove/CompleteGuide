package chapter_6;

//В этой программе применяется метод с параметрами
public class Box5 {

    double width; //ширина
    double height; //высота
    double depth; //глубина

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    //установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {

        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        //инициализировать каждый экземпляр класса Box5
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        //vol = mybox1.volume();
        //получить объем первого параллелепипеда
        System.out.println("Объем равен " + mybox1.volume());

        //vol = mybox2.volume();
        //получить объем второго параллелепипеда
        System.out.println("Объем равен " + mybox2.volume());
    }
}
