import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsFrame extends JFrame {

    //Score count
    int playerWins = 0;
    int computerWins = 0;
    int ties = 0;

    //Labels
    JLabel mainLabel = new JLabel("Rock Paper Scissors");
    JLabel playerWinsLabel = new JLabel("Player Wins: " + playerWins);
    JLabel computerWinsLabel = new JLabel("Computer Wins: " + computerWins);
    JLabel tiesLabel = new JLabel("Ties: " + ties);

    //Panels
    JPanel mainPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JPanel statsPanel = new JPanel();
    JPanel resultsPanel = new JPanel();

    //Text area and scroll pane
    JTextArea resultsArea = new JTextArea(1, 40);
    JScrollPane resultsScroll = new JScrollPane(resultsArea);


    //Buttons
    JButton rockBtn = new JButton(new ImageIcon("img/rock_hand.png"));
    JButton paperBtn = new JButton(new ImageIcon("img/paper_hand.png"));
    JButton scissorsBtn = new JButton(new ImageIcon("img/scissors_hand.png"));
    JButton quitBtn = new JButton("Quit");

    //Border & Border Layout
    Border blackline = BorderFactory.createLineBorder(Color.DARK_GRAY);
    BorderLayout mainPanelLayout = new BorderLayout();
    GridLayout boardPanelLayout = new GridLayout(1, 3);
    GridLayout statsPanelLayout = new GridLayout(3, 1);


    public RockPaperScissorsFrame(String title) {
        super(title);

        add(mainPanel);
        setSize(700,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
   /* private void playGame() {
        int playerPic;
        int computerPic;

        rockBtn.addActionListener((ActionEvent ae) -> {
            playerPic = 1; //rock
        });
        paperBtn.addActionListener();
        scissorsBtn.addActionListener();

        resultsArea.append(calculateResults());
    }*/

   /* private void calculateResults() {

    } */


}
