package chapter_15;

//Продемонстрировать ссылку на статический метод

//Функциональный интерфейс для операций над символьными строками
interface StringFunc_2 {
    String func(String n);
}

//В этом классе определяется статический метода strReverse()
class MyStringOps {
    //Статический метод, изменяющий порядок следования символов в строке
    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}

public class MethodRefDemo {
    //В этом методе функциональный интерфейс указывается в качестве типа первого его параметра.
    // Следовательно, ему может быть передан любой экземпляр данного интерфейса, включая и ссылку на метод
    static String stringOp(StringFunc_2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        //Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
