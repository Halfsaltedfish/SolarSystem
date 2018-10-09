package xin.developer97.solar;

import xin.developer97.util.Constant;
import xin.developer97.util.GameUtil;
import xin.developer97.util.MyFrame;

import java.awt.*;

/**
 * 太阳系的主窗口
 */
public class SolarFrame extends MyFrame {
    Image bg = GameUtil.getImage("images/bg.jpg");
    Star sun = new Star("images/sun.jpg", Constant.GAME_WIDTH/2,Constant.GAME_HEIGH/2);
    Plant earth = new Plant("images/Earth.jpg",150,100,0.1,sun);
    Plant moon = new Plant("images/moon.jpg",30,5,0.05,earth);
    Plant mars = new Plant("images/Mars.jpg",200,130,0.2,sun);


    public void paint(Graphics g){
        g.drawImage(bg,0,0,null);
        sun.draw(g);
        earth.draw(g);
        mars.draw(g);
        moon.draw(g);
    }

    public static void main(String[] args) {
        new SolarFrame().lunchFrame();

    }
}
