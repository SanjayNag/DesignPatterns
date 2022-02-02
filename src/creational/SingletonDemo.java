package creational;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singletonObj = Singleton.getSingletonObj();
        System.out.println("First singleton Object : "+singletonObj);

        Singleton singletonSecObj = Singleton.getSingletonObj();
        System.out.println("Second singleton Object :"+singletonSecObj);

    }
}
