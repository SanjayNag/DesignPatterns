package creational;

public class Singleton {

    //Early load of a instance
    //private static Singleton singletonObj = new Singleton();

    //Lazy load of a instance
    private static Singleton singletonObj = null;

    //Private keyword used to avoid new keyword for the creation of the object
    private Singleton(){
    }

    public static Singleton getSingletonObj(){
        if(singletonObj == null){
            singletonObj = new Singleton();
        }
        return singletonObj;
    }
}
