package chapter_11;

//Создать несколько потоков исполнения
class NewThread_2 implements Runnable {
    String name; //имя потока исполнения
    Thread t;

    NewThread_2(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); //запустить поток на исполнение
    }

    //Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + t);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }
}


class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread_2("Один"); //запустить потоки на исполнение
        new NewThread_2("Два");
        new NewThread_2("Три");

        try {
            //ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен.");
    }
}