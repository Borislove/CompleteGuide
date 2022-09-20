package chapter_15;

//Продемонстрировать применение ссылки на конструктор

//В функциональном интерфейсе MyFunc_4 определяется метод, возвращающий ссылку на класс MyClass_1
interface MyFunc_4 {
    MyClass_1 func(int n);
}

class MyClass_1 {
    private int val;

    //Этот конструктор принимает один аргумент
    MyClass_1(int v) {
        val = v;
    }

    //А это конструктор по умолчанию
    MyClass_1() {
        val = 0;
    }

    int getVal() {
        return val;
    }
}


public class ConstructorRefDemo {
    public static void main(String[] args) {

        //Создать ссылку на конструктор класса MyClass_1
        //Метод fucn() из интерфейса MyFunc_3 принимает аргумент, поэтому в операции new вызывается параметризованный конструктор класса MyClass_1,
        //а не к его конструктор по умолчанию
        MyFunc_4 myClassCons = MyClass_1::new;
        //Создать экземпляр класса MyClass_1 по ссылке на его конструктор
        MyClass_1 mc = myClassCons.func(100);
        //Использовать только что созданный экземпляр класса MyClass_1
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
