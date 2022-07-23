package chapter_9;

import chapter_9.Interface.Callback;
import chapter_9.Interface_2.Client;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
