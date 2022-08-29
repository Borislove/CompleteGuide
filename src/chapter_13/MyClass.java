package chapter_13;

public class MyClass {
    int a;
    int b;

    //инициализировать поля a и b по отдельности
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    //инициализировать поля a и b одним и тем же значением
    MyClass(int i) {
        this(i, i); //по этой ссылке вызывается конструктор MyClass(i,i)
    }

    //присвоить полям a и нулевое значение по умолчанию
    MyClass() {
        this(0); //a по этой ссылке вызвается конструктор MyClass(0)
    }
}
