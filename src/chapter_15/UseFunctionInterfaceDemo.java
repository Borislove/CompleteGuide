package chapter_15;

//Использовать предопределенный функциональный интерфейс Function

//импортировать функциональный интерфейс Function
import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {

        //это блочное лямбда-выражение вычисляет факториал целочисленного значения. Для этой цели на сей раз исползуется функциональный интерфейс Function
        Function<Integer, Integer> factorial = (n) ->{
            int result = 1;
            for(int i = 1; i <=n; i++)
                result = i*result;
            return result;
        };

        System.out.println("Факториал числа 3 равен "+factorial.apply(3));
        System.out.println("Факториал числа 5 равен "+factorial.apply(5));
    }
}
