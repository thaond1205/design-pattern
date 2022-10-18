package Singleton;

public class EagerInitialization {
    //mục đích: chỉ khởi tạo duy nhất khi được gọi
    //khởi tạo đối tượng duy nhất của class
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    //tạo contructor private
    private EagerInitialization(){

    }

    //tạo method public trả về INSTANCE bên trên để bên ngoài gọi vào
    public static EagerInitialization getInstance(){
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
