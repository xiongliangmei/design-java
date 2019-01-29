package behavior.Chain;

public class ConcreateHandler extends Handler {
    @Override
    public void handleRequest() {
        if (getSuccessor() != null){
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        }else {
            System.out.println("处理请求");
        }
    }
}
