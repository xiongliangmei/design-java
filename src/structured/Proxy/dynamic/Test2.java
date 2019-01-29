package structured.Proxy.dynamic;

import java.lang.reflect.Proxy;

public class Test2 {
    public static void main(String[] args) {
        Source source = new Source();
        MyInvocationHandler2 myInvocationHandler2 = new MyInvocationHandler2(source);

        //调用动态代理类 反射实例化类
        Sourceable sourceable = (Sourceable) Proxy.newProxyInstance(source.getClass().getClassLoader(),new Class[]{Sourceable.class},myInvocationHandler2);
        sourceable.method();
    }
}
