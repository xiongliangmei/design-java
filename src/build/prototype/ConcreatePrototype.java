package build.prototype;

public class ConcreatePrototype implements Prototype {
    private String name;
    @Override
    public Prototype clone() {
        //最简单克隆
        Prototype prototype = new ConcreatePrototype();
        prototype.setName(this.name);
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
