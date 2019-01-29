package structured.Adaper.object;

public class Adapter {
    private Adaptee adaptee;
    private Target target;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    /**
     *  源类Adaptee 有方法sampleOperation1
     */
    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }

    public void sampleOperation2(){
        this.target.sampleOperation2();
    }
}
