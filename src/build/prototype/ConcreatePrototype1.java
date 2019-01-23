package build.prototype;

public class ConcreatePrototype1 implements Prototype {
    private String name;
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcreatePrototype1();
        return prototype;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
