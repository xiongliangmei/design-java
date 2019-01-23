package build.prototype;

public class Test {
    public static void main(String[] args) throws Exception {
        Prototype p1 = new ConcreatePrototype();
        PrototypeManager.setPrototype("p1",p1);
        //获取原型来创建对象
        Prototype p3 = (Prototype) PrototypeManager.getPrototype("p1").clone();

    }
}
