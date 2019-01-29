package structured.Bridge;

public class Test {
    public static void main(String[] args) {
        Shape reCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        reCircle.draw();

        greenCircle.draw();
    }
}
