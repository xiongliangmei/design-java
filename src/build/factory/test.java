package build.factory;

/***
 * 调用 工厂方法测试
 */
public class test {
    public static void main(String[] args) {
       ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
