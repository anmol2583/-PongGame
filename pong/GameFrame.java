import javax.swing.*;
import java.awt.*;
public class GameFrame extends JFrame {
    GameFrame()
    {
        setTitle("PongGame");
       // setLayout(null);
     //  setSize(1000,555);
        getContentPane().setBackground(Color.BLACK);
        GamePanel panel = new GamePanel();
        add(panel);
         pack();
      //  setFocusable(true);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GameFrame g =new GameFrame();
    }
}
