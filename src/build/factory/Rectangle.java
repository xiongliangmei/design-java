package build.factory;

/***
 * 所有的类都实现 Shape 接口
 * @author  xl
 * @time  19/1/23  9:59
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
