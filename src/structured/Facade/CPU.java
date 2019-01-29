package structured.Facade;

public class CPU implements Systems {
    @Override
    public void start() {
        System.out.println("cpu start");
    }

    @Override
    public void shutDown() {
        System.out.println("cpu shut down");
    }
}
