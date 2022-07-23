package chapter_9.Interface;

public class Client implements Callback {

    //Реализовть интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback(), " + " вызываемый со значением" +p);
    }
}
