package structured.Proxy.statis;
/**
 * 代理对象
 * **/
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
