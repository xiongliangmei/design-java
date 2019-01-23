package build.builder;

/***
 * 继承汉堡抽象 类
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vue Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
