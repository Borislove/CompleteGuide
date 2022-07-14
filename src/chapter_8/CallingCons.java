package chapter_8;
//Порядок вызова конструкторов

//создать суперкласс
class A {
    A() {
        System.out.println("В конструкторе A.");
    }
}

//создать подкласс путем расширения класса A
class B extends A {
    B() {
        System.out.println("В конструкторе B.");
    }
}

//создать еще один подкласс путем расширения класса B
class C extends B {
    C() {
        System.out.println("В конструкторе C.");
    }
}


public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
