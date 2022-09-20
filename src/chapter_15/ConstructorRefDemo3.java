package chapter_15;

//Реализовать простую фабрику классов, используя ссылку на конструктор
interface MyFunc_f<R, T> {
    R func(T n);
}

//Простой обобщенный класс
class MyClass_<T> {
    private T val;

    //Конструктор, принимающий один параметр
    MyClass_(T v) {
        val = v;
    }

    //Конструктор по умолчанию. Этот конструктор в данной программе НЕ используется
    MyClass_() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

//простой необобщенный класс
class MyClass__ {
    String str;

    //конструктор, принимающий один аргумент
    MyClass__(String s) {
        str = s;
    }

    //Конструктр по умолчанию. Этот конструктор в данной программе НЕ используется
    MyClass__() {
        str = "";

    }

    String getVal() {
        return str;
    }
}

public class ConstructorRefDemo3 {
    //Фабричный метод для объектов разных классов. У каждого класса должен быть свой конструктор, принимающий один параметр типа T. А параметр R обозначает тип создаваемого объекта
    static <R, T> R myClassFactory(MyFunc_f<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        //Создать ссылку на конструктор класса MyClass_. Здесь в операции new вызывается конструктор, принимающий аргумент
        MyFunc_f<MyClass_<Double>, Double> myClassCons = MyClass_<Double>::new;

        //создать экземпляр типа класса MyClass_, используя фабричный метод
        MyClass_<Double> mc = myClassFactory(myClassCons, 100.1);

        //использовать только что созданный экземпляр класса MyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        //А теперь создать экземпляр друого класса, используя метод myClassFactory()
        MyFunc_f<MyClass__, String> myClassCons2 = MyClass__::new;

        //создать экземпляр класса MyClass__ , используя фабричный метод
        MyClass__ mc2 = myClassFactory(myClassCons2, "Лямбда");

        //использовать только что созданный экземпляр класса MyClass_
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}
