package structured.Bridge;

public class GreenCircle  implements DrawAPI{
    @Override
    public void drawCircle(int radius,int x,int y) {
        System.out.println("draw::Green");
    }
}
