package build.abstract_factory;

/****
 *  工厂模式是Java中最常用的设计模式之一。 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
 *  在工厂模式中，我们没有创建逻辑暴露给客户端创建对象，并使用一个通用的接口引用新创建的对象。
 * @author  xl
 * @time  19/1/23
 */
public interface Color {
    void fill();
}
