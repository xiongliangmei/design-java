package structured.Proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 动态代理模式二
 * **/
public class MyInvocationHandler implements InvocationHandler{

    private Object target;

    Object bind(Object i) {
        target = i;
        Object warpedItf;
        warpedItf = Proxy.newProxyInstance(target.getClass().getClassLoader(), i.getClass().getInterfaces(), this);
        return warpedItf;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method excute");
        Object result = method.invoke(target,args);
        System.out.println("after method excute");
        return result;
    }
}
