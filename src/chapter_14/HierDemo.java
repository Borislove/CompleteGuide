package chapter_14;

class Gen_2<T>{
    T ob; //объявить объект типа T

    //передать конструктору ссылку на объект типа T
    Gen_2(T o){
        ob = o;
    }

    //возвратить ссылку ob
    T getOb(){
        return ob;
    }
}

//Подкласс, производный от класса Gen, где определяется второй параметр типа V
class Gen2<T , V> extends Gen_2<T>{
    V ob2;
    Gen2(T o, V o2){
        super(o);
        ob2 = o2;
    }

    V getOb2(){
        return ob2;
    }
}

public class HierDemo {
    public static void main(String[] args) {

    //создать объекты типа Gen2 для символьных строк целых чисел
    Gen2<String,Integer> x = new Gen2<String , Integer>("Значение равно: ",99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
