package chapter_12.AnnotationExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Маркерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}
public class Marker {
    //Аннотировать метод с помощью маркера, скобки обязательны!!!
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();

        try{
            Method m = ob.getClass().getMethod("myMeth");
            //определить наличие аннотации
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Маркерная аннотация MyMarker присутствует.");
        }catch (NoSuchMethodException exc){
            System.out.println("Метод ненайден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
