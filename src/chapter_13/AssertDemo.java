package chapter_13;

//Продемонстрировать применение оператора assert
public class AssertDemo {
    static int val = 3;

    //возвратить целочисленное значение
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();
            //assert n > 0; //не подтвердится, если n == 0
            assert n > 0 : "n отрицательное!";
            System.out.println("n равно " + n);
        }
    }
}

//java -ea AssertDemo.java