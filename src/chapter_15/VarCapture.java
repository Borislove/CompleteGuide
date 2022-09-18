package chapter_15;

//Пример захвата локальной переменной из объемлющей области видимости

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        //Локальная переменнная, которая может быть захвачена
        int num = 10;

        MyFunc myLambda = (n) -> {
            //Такое применение переменнной num допустимо, поскольку она не видоизменяется
            int v = num + n;

            return v;
        };
    }
}
