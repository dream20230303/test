package com.company;
import javax.swing.JFrame;


public class BallGame extends JFrame {
    //窗口加载
    void launchFrame(){
        setSize(300,300);
        setLocation(400,400);
        setVisible(true);
    }
    public static void main(String[] args){
        System.out.println("1");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
