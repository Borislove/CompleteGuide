package chapter_12.AnnotationExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Объявление типа аннтоации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

public class Meta {
    //Аннотировать метод
    @MyAnno_3(str = "Пример аннотации", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        //получить аннотацию из метода и вывести значения ее членов
        try {
            //сначало получить объект типа Class, представляющий данный класс
            Class<?> c = ob.getClass();
            //затем получить объект типа Method, представляющий данный метод
            Method m = c.getMethod("myMeth");
            //далее получить аннотацию для данного класса
            MyAnno_3 anno = m.getAnnotation(MyAnno_3.class);
            //и наконец, вывести значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
