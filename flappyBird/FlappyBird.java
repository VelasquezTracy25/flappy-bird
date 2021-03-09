package flappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Rectangle;


import javax.swing.JFrame;
import javax.swing.Timer;


public class FlappyBird implements ActionListener
{

    public static FlappyBird flappyBird;

    public final int WIDTH = 800, HEIGHT = 800;

    public Renderer renderer;

    public Rectangle bird;

    public FlappyBird(){
        JFrame jframe = new JFrame();

        Timer timer = new Timer(20, this);

        renderer = new Renderer();

        jframe.add(renderer);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20 );

        timer.start();
    }

    public void repaint(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.orange);
        g.fillRect(0, HEIGHT - 150, WIDTH, 150);

        g.setColor(Color.red);
        g.fillRect(0, HEIGHT- 150, WIDTH, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            renderer.repaint();        
    }


    public static void main(String[] args){
        flappyBird = new FlappyBird();

    }
}
