package com.company;
import com.sun.deploy.security.SelectableSecurityManager;

import javax.swing.JFrame;
import java.awt.*;


public class BallGame2 extends JFrame {
    //添加小球的和桌面图片的路径
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");

    //指定小球的初始位置
    double x=100;//小球的横坐标
    double y=100;//小球的纵坐标
    double degree =3.14/3;//弧度：小球运动的角度，此处为60度

    //画窗口的方法，加载小球与桌面
    public void paint(Graphics g){
        System.out.println("窗口画一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        //根据角度degree改变小球的坐标
        x = x+10*Math.cos(degree);
        y = y+10*Math.sin(degree);
        //边界检测：碰到上下边界
        //500是窗口的高度，40是桌面的边框，30球的直径，最后一个40是标题栏的高度
        if(y>500-40-30||y<40+40){
            degree=-degree;
        }
        //边界检测：碰到左右边界
        //856是窗口的高度，40是桌子的边框，30是球的直径
        if (x<40||x>856-40-30){
            degree=3.14-degree;
        }

    }

    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);
        while (true){
            repaint();
            try{
                Thread.sleep(40);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        System.out.println("2");
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }
}
