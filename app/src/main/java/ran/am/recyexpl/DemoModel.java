package ran.am.recyexpl;

import android.graphics.Bitmap;

public class DemoModel { String s1;
    String s2;
    Bitmap bmp;

    public DemoModel(String s1, String s2, Bitmap bmp) {
        this.s1 = s1;
        this.s2 = s2;
        this.bmp = bmp;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public Bitmap getBmp() {
        return bmp;
    }
}
