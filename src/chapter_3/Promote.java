package chapter_3;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        /*
           (float * byte = float)
         + (int/char = int)
         - (double*short = double)
         -->
         (float) + (int) - (double)
         -->(float + int = float) - double
         --> float - double
         --> double
        */
        System.out.println("result = " + result);
    }
}

