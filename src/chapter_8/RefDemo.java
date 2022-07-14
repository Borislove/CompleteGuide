package chapter_8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен "+vol);
        System.out.println("Вес weightbox раве "+weightbox.weight);
        System.out.println();

        //присвоить перменной ссылки на объект типа BoxWeight ссылку на объект типа Box
        plainbox = weightbox;
        vol = plainbox.volume();//верно, так как метод volume() опеределен в классе Box
        System.out.println("Объем plainbox равен "+vol);
    }
}
