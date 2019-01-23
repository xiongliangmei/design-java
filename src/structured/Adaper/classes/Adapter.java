package structured.Adaper.classes;

public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.println("我是适配增强的方法");
    }
}
