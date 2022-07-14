package chapter_8.Dynamic;

//Динамическая диспетчеризация методов
class A {
    void callme() {
        System.out.println("В методе callme() из класса A");
    }
}

class B extends A {
    //переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C extends A {
    //переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса C");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A a = new A(); //объект класса A
        A b = new B(); //объект класса B
        A c = new C(); //объект класса C

        A r;        //получить ссылку на объект типа A

        r = a;      //переменна r ссылается на объект типа A
        r.callme(); //вызвать вариант метода callme(), определенный в классе A

        r = b;      //переменная r ссылается на объект типа B
        r.callme(); //вызвать вариант метода callme(), определенный в классе B

        r = c;      //переменная r ссылается на объект типа C
        r.callme(); //вызвать вариант метода callme(), определенный в классе C
    }
}