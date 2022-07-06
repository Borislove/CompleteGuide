package chapter_7;

//В этой программе демонстрируется отличие модификаторов public и private
public class TestModificator {

    int a; //доступ, определяемый по умолчанию
    public int b; //открытй доступ
    private int c; //закрытй доступ

    //методы доступа к члену с данного класса
    void setc(int i) {
        //установить значение члена с данного класса
        c = i;
    }

    int getc() {
        //получить значение члена с данного класса
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        TestModificator ob = new TestModificator();

        //Эти операторы правильны, поэтому члены a и b данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        //Этот оператор неверен и может вызвать ошибку
        //ob.c = 100; //ОШИБКА!

        //Доступ к члену с данного класса должен осуществляться с помощью методов его класса
        ob.setc(100); //ВЕРНО!
        System.out.println("a, b, и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}