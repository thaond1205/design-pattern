package Singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE=new ThreadSafeSingleton();
        }
        return INSTANCE;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
