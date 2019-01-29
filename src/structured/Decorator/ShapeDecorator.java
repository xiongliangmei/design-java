package structured.Decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShap;

    public ShapeDecorator(Shape decoratedShap) {
        this.decoratedShap = decoratedShap;
    }

    @Override
    public void draw() {
        decoratedShap.draw();
    }
}
