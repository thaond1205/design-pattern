package Singleton;

public class LazyInitialization {
    //tạo biến private
    private static LazyInitialization INSTANCE;

    //tạo contructor private
    private LazyInitialization() {

    }
    //method public để class ngoài gọi vào
    //check nếu INSTANCE == null thì sẽ không thươc hiện tạo mới INSTANCE
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
