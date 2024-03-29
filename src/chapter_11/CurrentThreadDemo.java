package chapter_11;

//Управление главным потоком исполнения
public class CurrentThreadDemo {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + t);

        //изменить имя потока исполнениея
        t.setName("My Thread");
        System.out.println("После изменение имени потока: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("n = " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
