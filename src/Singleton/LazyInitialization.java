package Singleton;

public class LazyInitialization {
    private static LazyInitialization INSTANCE;

    private LazyInitialization() {

    }
    public static LazyInitialization getInstance() {
        if(INSTANCE == null){
            INSTANCE = new LazyInitialization();
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
