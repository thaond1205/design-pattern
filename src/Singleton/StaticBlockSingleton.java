package Singleton;

public class StaticBlockSingleton {

    //tạo đối tượng private duy nhất
    private static StaticBlockSingleton INSTANCE;
    //contructor private
    private StaticBlockSingleton(){}

    static{
        try {
            INSTANCE = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    //method này để class bên ngoài truy cập vào
    public StaticBlockSingleton getInstance(){
        return INSTANCE;
    }
}
