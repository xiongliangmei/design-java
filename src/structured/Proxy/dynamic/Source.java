package structured.Proxy.dynamic;

/**
 * 代理对象
 * **/
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
