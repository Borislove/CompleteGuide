package chapter_8.example_3;

//Переопределение метода
class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    //вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show(); //здесь вызывается метод show()
        System.out.println("k: " + k);
    }
}

public class Override {

    public static void main(String[] args) {
        B subOb = new B(10, 20, 30);
        subOb.show(); //здесь вызывается метод show() из класса B
    }
}
