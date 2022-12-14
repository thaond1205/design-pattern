package Singleton;

public class ClientTest{

    public static void main(String[] args) {
//        EagerInitializationTest();
//        LazyInitializationTest();
//        ThreadSafeSingletonTest();
    }

    public static void EagerInitializationTest(){
        EagerInitialization e1 = EagerInitialization.getInstance();
        e1.setName("John");
        System.out.println("name1: "+e1.getName());

        EagerInitialization e2 = EagerInitialization.getInstance();
        System.out.println("name2: "+e2.getName());
    }

    public static void LazyInitializationTest(){
        LazyInitialization l1 = LazyInitialization.getInstance();
        l1.setName("Duc Thao");
        System.out.println("Name1 : "+l1.getName());

        LazyInitialization l2 = LazyInitialization.getInstance();
        System.out.println("Name2 : "+l2.getName());
    }

    public static void ThreadSafeSingletonTest(){
        for (int i = 0 ; i < 5 ; i++){
            ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
            t1.setName(String.valueOf(i));
            System.out.println(t1.getName());

            try {
                Thread.sleep(5000);
            }catch (Exception e){
                throw new RuntimeException(e);
            }

        }
    }
}
