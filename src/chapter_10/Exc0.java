package chapter_10;

//Необрабатываемые исключения
public class Exc0 {
    public static void main(String[] args) {
        int d = 0;
        int a = 42 / d;
        System.out.println(a);
    }
}

//Exception in thread "main" java.lang.ArithmeticException: / by zero