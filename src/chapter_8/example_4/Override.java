package chapter_8.example_4;

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

    //перегрузить метод super()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override {

    public static void main(String[] args) {
        B subOb = new B(100, 200, 300);
        subOb.show("Это k : "); //вызвать метод show() из класса B
        subOb.show(); //вызвать метод show() из класса A
    }
}



