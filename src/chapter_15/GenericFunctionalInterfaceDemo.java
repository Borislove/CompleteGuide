package chapter_15;

//Применить обобщенный функциональный интерфейс с разнотипными лямбда-выражениями

//Обобщенный функциональный интерфейс
interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {

        //Использовать строковый вариант функционального интерфейса SomeFunc
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };
        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));

        //А теперь использовать целочисленный вариант функционального интерфейса SomeFunc
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };
        System.out.println("Факториал числа 3 равен "+factorial.func(3));
        System.out.println("Факториал числа 5 равен "+factorial.func(5));
    }
}
