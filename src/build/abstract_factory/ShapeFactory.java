package build.abstract_factory;

/***
 * 具体工厂方法继承抽象方法
 * */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (null == shape){
            return  null;
        }
        if ("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        }else if ("RECTANGLE".equalsIgnoreCase(shape)){
            return new Rectangle();
        }else if ("SQUARE".equalsIgnoreCase(shape)){
            return new Square();
        }
        return  null;
    }
}
