package build.factory;

/***
 * 创建工厂根据给定的信息生成具体的类的对象
 * @author xl
 * @time  19/1/23  10:02
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (null == shapeType){
            return  null;
        }
        if ("CIRCLE".equalsIgnoreCase(shapeType)){
            return  new Circle();
        }else if ("RECTANGLE".equalsIgnoreCase(shapeType)){
            return  new Rectangle();
        }else if ("SQUARE".equalsIgnoreCase(shapeType)){
            return  new Square();
        }
        return  null;
    }
}
