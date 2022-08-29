package chapter_13;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Отображение содержимого текстового файла.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        //сначало убедиться , что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        //Попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }

        //Теперь файл открыт и готов к чтению
        //Далее из него читаются символы до тех пор, пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }
        //закрыть файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрыти файла");
        }
    }
}


//java ShowFile.java lorem.txt