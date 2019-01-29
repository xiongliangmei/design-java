package structured.Proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理模式一
 * **/
public class MyInvocationHandler2 implements InvocationHandler {

    private Object target; //代理对象

    public MyInvocationHandler2(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强方法前");
        Object result = method.invoke(target,args); //调用代理对象的方法
        System.out.println("增强方法后");
        return result;
    }
}
