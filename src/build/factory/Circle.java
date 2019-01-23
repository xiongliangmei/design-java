package build.factory;
/***
 * 所有的类都实现 Shape 接口
 * @author  xl
 * @time  19/1/23  9:59
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle::draw");
    }
}
