import javax.swing.*;
import java.awt.*;

public class RockPaperScissorsFrame extends JFrame {
    JLabel mainLabel = new JLabel("Rock Paper Scissors");
    JPanel mainPanel = new JPanel();

    public RockPaperScissorsFrame(String title) {
        super(title);

        add(mainPanel);
        setSize(700,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
