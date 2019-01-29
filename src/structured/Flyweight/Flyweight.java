package structured.Flyweight;
/**
 * 在享元模式中通常会出现工厂模式，需要创建一个享元工厂来负责维护一个享元池(Flyweight Pool)（用于存储具有相同内部状态的享元对象）。
 * 在享元模式中，共享的是享元对象的内部状态，外部状态需要通过环境来设置。在实际使用中，能够共享的内部状态是有限的，
 * 因此享元对象一般都设计为较小的对象，它所包含的内部状态较少，这种对象也称为 细粒度对象。
 * **/
public interface Flyweight {
    public void operation(String state);
}
