package chapter_12;

//Использовать конструктор, переменную экземпляра и метод в перечислении
enum Apple_2 {

    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; //цена яблока каждого сорта

    //конструктор
    Apple_2(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        //вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит " + Apple_2.Winesap.getPrice() + " центов.\n");
        //вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок:");
        for (Apple_2 a : Apple_2.values())
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
    }
}
