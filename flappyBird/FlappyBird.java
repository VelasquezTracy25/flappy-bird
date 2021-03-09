package flappyBird;

import javax.swing.JFrame;

public class FlappyBird {

    public static FlappyBird flappyBird;

    public final int WIDTH = 800, HEIGHT = 800;

    public Renderer renderer;

    public FlappyBird(){
        JFrame jframe = new JFrame();

        jframe.add(renderer);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void repaint(Graphics g){

    }
    public static void main(String[] args){
        flappyBird = new FlappyBird();

    }
}
