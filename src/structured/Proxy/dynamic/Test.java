package structured.Proxy.dynamic;


public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        //参数1 是类加载器  参数2，是代理的接口 ,参数3 代理实现动态接口实现类
        Sourceable sourceable = (Sourceable) myInvocationHandler.bind(source);
        sourceable.method();

    }
}
