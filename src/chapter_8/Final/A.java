package chapter_8.Final;

public class A {

    final void meth() {
        System.out.println("Это конечный метод.");
    }
}

class B extends A {

    //ОШИБКА!!!Этот метод не может быть переопределен.
    /*void meth(){
        System.out.println("Недопустимо!");*/

}
