package structured.Proxy.statis;

public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void method() {
        System.out.println("代理增强开始");
        source.method();
        System.out.println("代理增强结束");
    }
}
