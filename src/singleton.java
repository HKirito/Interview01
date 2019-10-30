
public class singleton {
    private singleton(){}

    private static final singleton instance;

    static {
        instance = new singleton();
    }

    public static singleton getInstance(){
        return instance;
    }
}
