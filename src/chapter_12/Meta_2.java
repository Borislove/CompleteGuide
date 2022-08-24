package chapter_12;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno_2 {
    String str();
    int val();
}

public class Meta_2 {
    //У метода myMeth() теперь имеются два аргумента
    @MyAnno_2(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta_2 ob = new Meta_2();

        try {
            Class<?> c = ob.getClass();
            //Здесь указываются типы параметров
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno_2 anno = m.getAnnotation(MyAnno_2.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
