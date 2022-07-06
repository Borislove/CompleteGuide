package chapter_7;

import java.util.Arrays;

//Вывести все аргументы командной строки
public class CommandLine {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
            System.out.println("test");

    }
}

//java CommandLine this is a test 100 - 1