package chapter_15;

//Продемонстрировать применение ссылки на конструктор обобщенного класса

//Теперь функциональный интерфейс MyFunc_5 объявляется как обобщенный

interface MyFunc_5<T> {
    MyClass_3<T> func(T n);
}

class MyClass_3<T> {
    private T val;

    //Этот конструктор принимает один аргумент
    MyClass_3(T v) {
        val = v;
    }

    //А это конструктор по умолчанию
    MyClass_3() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {

        //создать ссылку на конструктор обобщенного класса MyClass_3<T>
        MyFunc_5<Integer> myClassCons = MyClass_3<Integer>::new;

        //создать экземпляр класса MyClass_3<T> по данной ссылке на конструктор
        MyClass_3<Integer> mc = myClassCons.func(100);

        //воспользоваться только что созданным экземпляром класса MyClass_3<T>
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
