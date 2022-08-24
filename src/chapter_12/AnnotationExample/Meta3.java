package chapter_12.AnnotationExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

//Объявление типа аннотации, включая значения ее членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno_3 {
    String str() default "Тестирование";
    int val() default 9000;
}
public class Meta3 {
    //анннотировать метод, используя значения по умолчанию
    @MyAnno_3()
    public static void myMeth(){
        Meta3 ob = new Meta3();

        //получить аннотацию для данного метода и вывести значения ее членов
        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno_3 anno = m.getAnnotation(MyAnno_3.class);
            System.out.println(anno.str() + " "+ anno.val());
        }catch (NoSuchMethodException exc){
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
