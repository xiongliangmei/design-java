package build.abstract_factory;


public class test {
    public static void main(String[] args) {
       AbstractFactory colorFactory =  FactoryProducer.getFactory("COLOR");  //得到ColorFactory
       Color color = colorFactory.getColor("RED");
       color.fill();

       Color color1 = colorFactory.getColor("GREEN");
       color1.fill();

       Color color2 = colorFactory.getColor("BLUE");
       color2.fill();

       AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

       Shape shape = shapeFactory.getShape("CIRCLE");
       shape.draw();

       Shape shape1 = shapeFactory.getShape("SQUARE");
       shape1.draw();

       Shape shape2 = shapeFactory.getShape("RECTANGLE");
       shape2.draw();


    }
}
