package chapter_9.p2;

public class Protection2 extends chapter_9.p1.Protection {
    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");
        //доступно только для данного класса или пакета
        //System.out.println("n = "+n);

        //доступно только для данного класса
        //System.out.println("n_pri ="+n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class OtherPackage {
    OtherPackage() {
        chapter_9.p1.Protection p = new chapter_9.p1.Protection();
        System.out.println("конструктор из другого пакета");

        //доступно только для даного класса или пакета
        //System.out.println("n = " + p.n);

        //доступно только для данного класса
        //System.out.println("n_pri = " + p.n_pri);

        //доступно только для данного класса, подкласса или пакета
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}