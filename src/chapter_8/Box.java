package chapter_8;

//В этой программе наследование применяется для расширения класса Box
public class Box {
    double width;
    double height;
    double depth;

    //сконструировать клон объекта
    Box(Box ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, применяемый в отсутствии размеров
    Box() {
        width = -1; //значение -1 служит для обозначения неинициализируемого параллелепипеда
        height = -1;
        depth = -1;
    }

    //конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

//расширить класс Box, включив в него поле веса
class BoxWeight extends Box {
    double weght; //вес параллелепипеда

    //конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weght = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен "+vol);
        System.out.println("Вес mybox1 равен "+mybox1.weght);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен "+vol);
        System.out.println("Вес mybox2 равен "+mybox2.weght);
    }
}