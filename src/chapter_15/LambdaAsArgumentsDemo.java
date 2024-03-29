package chapter_15;

//Передать лямбда-выражение в качестве аргумента вызываемому методу

interface StringFunc_1 {
    String func(String n);
}

public class LambdaAsArgumentsDemo {
    //Первый параметр этого метода имеет тип функционального интерфейса.Следовательно, ему можно
    //передать ссылку на любой экземпляр этого интерфейса, включая экземпляр, создаваемый в лямбда-выражении.
    //А второй параметр обозначает обрабатываемую символьную строку
    static String stringOp(StringFunc_1 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Это исходная строка: " + inStr);

        //Ниже приведено простое лямбда-выражение, преобразующее в прописные все буквы в исходной строке, передаваемой методу stringOp()
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Это строка прописными буквами: " + outStr);

        //А здесь передается блочное лямбда-выражение, удаляющее пробелы из исходной символьной строки
        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;
        }, inStr);

        System.out.println("Это строка с удаленными пробелами: " + outStr);

        //Можно, конечно, передать и экземпляр функционального интерфейса StringFunc_1, созданный в предыдущем лямбда-выражении
        //Например, после следующего объявления ссылка reverse делается на экземпляр интерфейса StringFunc_1
        StringFunc_1 reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        //А теперь ссылку reverse можно передать в качестве первого параметра методу stringOp(),
        //поскольку она делается на объект типа StringFunc_1
        System.out.println("Это обращенная строка: " + stringOp(reverse, inStr));
    }
}
