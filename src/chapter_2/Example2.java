package chapter_2;

/*Это еще один пример короткой программы.
Присвоить исходному файлу имя "Example2.java"
*/
public class Example2 {
    public static void main(String[] args) {
        int num; // в этой строке кода объявляется (целочисленная) переменная с именем num
        num = 100; //в этой строке кода переменной num присваивается значение 100
        System.out.println("Это переменная num: " + num);

        num = num * 2;

        System.out.print("Значение переменной num * 2 равно ");
        System.out.println(num);
    }
}
