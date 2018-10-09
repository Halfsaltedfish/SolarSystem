package xin.developer97.solar;

import xin.developer97.util.GameUtil;

import java.awt.*;

public class Star {
    Image img;
    double x,y;
    int width,heigh;

    public void draw(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);
    }

    public Star(String imgpath, double x, double y) {
        this.img = GameUtil.getImage(imgpath);
        this.x = x;
        this.y = y;

        this.width = img.getWidth(null);
        this.heigh = img.getHeight(null);
    }

    public Star() {
    }
}
