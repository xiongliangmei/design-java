package structured.Adaper.object;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        float f = 0.010999999940395355f;
        BigDecimal b = new BigDecimal(f);
        String sss = "";
        String ssss = sss.substring(0,3);
        System.out.println(ssss);
        float ss = b.setScale(3,BigDecimal.ROUND_HALF_UP).floatValue();
        System.out.println(ss);
    }
}
