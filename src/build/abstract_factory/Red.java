package build.abstract_factory;
/***
 * 所有的类都实现 Shape 接口
 * @author  xl
 * @time  19/1/23  9:59
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red::fill");
    }
}
