package build.abstract_factory;

import com.sun.org.apache.regexp.internal.RE;

/***
 * 创建工厂生成器/生成器类
 */
public class FactoryProducer {

    public  static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();      //具体工厂
        }
        if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
