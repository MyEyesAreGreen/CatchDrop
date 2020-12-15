import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static GameWindow gameWindow;

    public static void main (String[] args){
        gameWindow = new GameWindow();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setLocation(200,100);
        gameWindow.setSize(900,500);
        gameWindow.setResizable(false);
        GameField gameField = new GameField();
        gameWindow.add(gameField);
        gameWindow.setVisible(true);
    }

    private static void onRepaint (Graphics g){
        g.fillOval(10, 10, 200, 100);
    }

    private static class GameField extends JPanel{
        @Override
        protected void paintComponent (Graphics g){
            super.paintComponent(g);
            onRepaint(g);
        }
    }
}
