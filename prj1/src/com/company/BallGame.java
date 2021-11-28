package com.company;
import javax.swing.JFrame;
import java.awt.*;


public class BallGame extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
    double x=100;
    double y=100;

    //画窗口的方法，加载小球与桌面
    public void paint(Graphics g){
        System.out.println("窗口画一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);
    }

    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);
    }
    public static void main(String[] args){
        System.out.println("2");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
