package behavior.Chain;

public class Test {
    public static void main(String[] args) {
        //组装责任链
        Handler handler = new ConcreateHandler();
        Handler handler2 = new ConcreateHandler();

        handler.handleRequest();
    }
}
