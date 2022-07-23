package chapter_9;

import chapter_9.Interface.Callback;

//Еще одна реализация интерфейса Callback
public class AnotherClient implements Callback {

    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
