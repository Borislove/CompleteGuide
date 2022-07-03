package chapter_7;

//В этой версии класса Box2 один объект допускается инициализировать другим объектом
public class Box2 {
    double width;
    double height;
    double depth;

    //Обратите внимание на этот конструктор. В качестве параметра в нем используется объект типа Box2
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор , используемый, когда указываются все размеры
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, используемый, если ни один из размеров не указан
    Box2(){
        width =-1; //использовать значение -1 для обозначения неинициализированного параллелепипеда
        height =-1;
        depth =-1;
    }

    //конструктор, используемый при создании куба
    Box2(double len){
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume(){
        return  width * height * depth;
    }
}

class OverloadCons2{
    public static void main(String[] args) {
        //создать параллелепипеды, используя разные конструкторы
        Box2 mybox1 = new Box2(10,20,15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);

        //создать копию объекта mybox1
        Box2 myclone = new Box2(mybox1);

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);

        //получить объем клона
        vol = myclone.volume();
        System.out.println("Объем клона равен "+vol);
    }
}