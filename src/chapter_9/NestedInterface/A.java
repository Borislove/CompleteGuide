package chapter_9.NestedInterface;

//Пример вложенного интерфейса

//Этот класс содержит интерфейс как свой член
public class A {
    //это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

//Класс B реализует вложенный интерфейс
class B implements A.NestedIF {

    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        //использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");

        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}