package build.singleton;

/***
 * 单例模式 即只有一个实例
 * 最主要是构造方法私有 饿汉式
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
