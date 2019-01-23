package build.builder;

/***
 * 我们将创建一个Item接口，表示食品项目，如汉堡包和冷饮料以及实现Item接口的具体类。还有一个包装接口，
 * 表示食品包装和实现包装接口的具体类，因为汉堡包装在包装和冷饮将包装成瓶子。
 */
public interface Item {
    String name(); //商品名称
    Packing packing(); //包装
    float price(); //价格
}
