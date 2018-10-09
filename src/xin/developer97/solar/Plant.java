package xin.developer97.solar;

import xin.developer97.util.GameUtil;

import java.awt.*;

public class Plant extends Star {
    double longAxis;
    double shortAxis;
    double speed;
    double degree;
    Star center;

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        drawTrace(g);
        move();
    }

    private void drawTrace(Graphics g){
        double ovalX,ovalY,ovalWidth,ovalHeigh;
        ovalWidth = longAxis * 2;
        ovalHeigh = shortAxis * 2;
        ovalX = center.x + center.width/2 - longAxis;
        ovalY = center.y + center.heigh/2 - shortAxis;

        Color c = g.getColor();
        g.setColor(Color.blue);
        g.drawOval((int)ovalX,(int)ovalY,(int)ovalWidth,(int)ovalHeigh);
    }

    private void move(){
        //沿着椭圆轨迹飞行
        x = center.x+center.width/2 + longAxis*Math.cos(degree);
        y = center.y+center.heigh/2 + shortAxis*Math.sin(degree);
        degree += speed;
    }

    public Plant(String imgpath, double longAxis, double shortAxis, double speed, Star center) {
        this.longAxis = longAxis;
        this.shortAxis = shortAxis;
        this.speed = speed;
        this.center = center;
        this.x = center.x + longAxis;
        this.y = center.y;
        this.img = GameUtil.getImage(imgpath);
    }

    public Plant(String imgpath, double x, double y) {
        super(imgpath, x, y);
    }
}
