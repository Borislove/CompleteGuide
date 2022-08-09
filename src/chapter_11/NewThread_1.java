package chapter_11;

//Создать второй поток исполнения, расширив класс Thread
public class NewThread_1 extends Thread {

    NewThread_1() {
        //создать новый поток исполнения
        super("Демонстрационнный поток");
        System.out.println("Дочерний поток: " + this);
        start(); //запустить поток на исполнение
    }

    //точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}

class ExtendThread {

    public static void main(String[] args) {

        new NewThread_1();//создать новый поток исполнения

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
