public class singleton1 {
    private singleton1(){}

    public static singleton1 instance = null;

    public static synchronized singleton1 getInstance(){
        if (instance == null){
            synchronized (singleton1.class){
                if (instance == null){
                    instance = new singleton1();
                }
            }
        }
        return instance;
    }
}
