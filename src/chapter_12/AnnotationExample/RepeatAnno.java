package chapter_12.AnnotationExample;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Продемонстрировать применение повторяющейся аннотации

//Сделать аннотацию MyAnno повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno_4 {
    String str() default "тестирование";

    int val() default 9000;
}

//Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno_4[] value();
}

public class RepeatAnno {
    //повторить аннотацию MyAnno в методе myMeth()
    @MyAnno_4(str = "Первая аннотация", val = -1)
    @MyAnno_4(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();
            //Получить аннотации для метода myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);
            //Вывести повторяющиеся аннотации MyAnno
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}

