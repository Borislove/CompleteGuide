package chapter_9.Interface_2;

import chapter_9.Interface.Callback;

public class Client implements Callback {
    //Реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Мето callback(), " + " вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, " + " могут определяться и другие члены.");
    }
}
