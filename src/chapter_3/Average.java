package chapter_3;

//Вычисление среднего из массива значений
public class Average {
    public static void main(String[] args) {
        double numbs[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
            result = result + numbs[i];
        System.out.println("Среднее значение равно " + result / 5);  //12.299999999999999
    }
}
