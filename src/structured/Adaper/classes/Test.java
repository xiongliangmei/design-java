package structured.Adaper.classes;

public class Test {
    public static void main(String[] args) {
        Adaptee adaptees = new Adapter();
        ((Adapter) adaptees).sampleOperation2();
    }
}
