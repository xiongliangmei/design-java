package build.prototype;

import java.util.Hashtable;

public class Test {
    public static void main(String[] args) throws Exception {
        ShapeCache.loadCache();

        Shape shape =(Shape) ShapeCache.getShape("1");
        System.out.println(shape.getType());

       Shape shape1 = (Shape) ShapeCache.getShape("2");
        System.out.println(shape1.getType());

        Shape shape2 = (Shape)ShapeCache.getShape("3");
        System.out.println(shape2.getType());
        Hashtable<String,Shape> shapeMap = ShapeCache.getShapeMap();
        System.out.println(shapeMap.size());
    }
}
