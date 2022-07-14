package chapter_8.UseSuper;

//Использовать ключевое слово super с целью предотвратить сокрытие имен
public class A {
    int i;
}

//создать подкласс путем расширения класса A
class B extends A{
    int i; //этот член i скрывает член i из класса A

    B(int a, int b){
        super.i = a; //член i из класса A
        i = b; //член i из класса B
    }

    void show(){
        System.out.println("Член i в суперклассе: "+super.i);
        System.out.println("Член i в подкласее: "+i);
    }
}

class UseSuper{
    public static void main(String[] args) {
        B subOb = new B(1,2);
        subOb.show();
    }
}