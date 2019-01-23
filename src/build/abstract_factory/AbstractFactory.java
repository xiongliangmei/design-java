package build.abstract_factory;

/***
 * 抽象工厂模式是一个超级工厂，用来创建其他工厂。 这个工厂也被称为工厂的工厂。 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
 * 在抽象工厂模式中，接口负责创建相关对象的工厂，而不明确指定它们的类。 每个生成的工厂可以按照工厂模式提供对象。
 * @author  xl
 * @time  19/1/23 10:23
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
