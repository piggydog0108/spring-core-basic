package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //외부에서 SingletonServicer객체선언을 막기 위해
    private SingletonService() {
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }







}