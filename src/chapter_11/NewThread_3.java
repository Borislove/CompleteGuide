package chapter_11;

//Применить метод join(), чтобы ожидать завершения потоков исполнения
public class NewThread_3 implements Runnable {
    String name; //имя поток исполнения
    Thread t;

    NewThread_3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); //запустить поток исполнения
    }

    //точква входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}

class DemoJoin {
    public static void main(String[] args) {
        NewThread_3 ob1 = new NewThread_3("Один");
        NewThread_3 ob2 = new NewThread_3("Два");
        NewThread_3 ob3 = new NewThread_3("Три");

        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());

        //ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());
    }
}
