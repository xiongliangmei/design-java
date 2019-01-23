package build.abstract_factory;
/***
 * 具体工厂方法继承抽象方法
 * @author  xl
 * @time 19/1/23 10:36
 * */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (null == color){
            return null;
        }
        if ("RED".equalsIgnoreCase(color)){
            return new Red();
        }else if ("GREEN".equalsIgnoreCase(color)){
            return new Green();
        }else if ("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
