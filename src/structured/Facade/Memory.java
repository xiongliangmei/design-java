package structured.Facade;

public class Memory implements Systems {
    @Override
    public void start() {
        System.out.println("Meory is start...");
    }

    @Override
    public void shutDown() {
        System.out.println("Memory is shutDown...");
    }
}
