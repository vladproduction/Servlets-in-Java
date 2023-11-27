package listener;

public class OldSingleton {

    private static final OldSingleton instance = new OldSingleton();

    private OldSingleton() {
    }

    public static OldSingleton getInstance(){
        return instance;
    }

    public void makeAction(){
        System.out.println("Action of OldSingleton");
    }
}
