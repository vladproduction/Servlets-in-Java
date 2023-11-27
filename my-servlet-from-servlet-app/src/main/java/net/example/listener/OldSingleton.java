package net.example.listener;

public class OldSingleton {

    private static OldSingleton instance = new OldSingleton();

    private OldSingleton() {
    }

    public static OldSingleton getInstance(){
        return instance;
    }

    public void makeAction(){
        System.out.println("makeAction()");
    }
}
