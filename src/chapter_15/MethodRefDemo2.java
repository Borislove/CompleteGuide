package chapter_15;

//Продемонстрировать применение ссылки на метод экземпляра

//Функциональный интерфейс для операций над символьными строками
interface StringFunc_3 {
    String func(String n);
}

//Теперь в этом классе определяется метод экземпляра strReverse()
class MyStringOps_3 {
    String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}

class MethodRefDemo2 {
    //В этом методе функциональный интерфейс указывается в качестве типа первого его параметра.
    //Следовательно, ему может быть передан любой экземпляр этого интерфейса, включая и ссылку на метод
    static String stringOp(StringFunc_3 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        //Создать объект типа MyStringOps_3
        MyStringOps_3 strOps = new MyStringOps_3();

        //А теперь ссылка на метод экземпляра strReverse() передается методу stringOp()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
