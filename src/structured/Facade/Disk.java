package structured.Facade;

public class Disk implements Systems {
    @Override
    public void start() {
        System.out.println("Disk is start");
    }

    @Override
    public void shutDown() {
        System.out.println("Disk is shut down");
    }
}
