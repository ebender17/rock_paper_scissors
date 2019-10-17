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

        UISetup();

        add(mainPanel);
        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void UISetup() {
        //set up layout of each panel & add border
        mainPanel.setLayout(mainPanelLayout);
        boardPanel.setLayout(boardPanelLayout);
        boardPanel.setBorder(blackline);
        statsPanel.setLayout(statsPanelLayout);


        //add panels to main panel
        mainPanel.add(mainLabel, BorderLayout.NORTH);
        mainPanel.add(boardPanel, BorderLayout.CENTER);
        mainPanel.add(statsPanel, BorderLayout.EAST);
        mainPanel.add(resultsPanel, BorderLayout.SOUTH);

        //add buttons to board panel
        boardPanel.add(rockBtn);
        boardPanel.add(paperBtn);
        boardPanel.add(scissorsBtn);

        //add actionListener to quit button
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        //add labels & text fields to stats panel
        statsPanel.add(playerWinsLabel);
        statsPanel.add(playerWinsField);
        playerWinsField.setEditable(false);
        statsPanel.add(computerWinsLabel);
        statsPanel.add(computerWinsField);
        computerWinsField.setEditable(false);
        statsPanel.add(tiesLabel);
        statsPanel.add(tiesField);
        tiesField.setEditable(false);

        //add scroll to results panel
        resultsPanel.add(resultsScroll);

        //play game

    }




   private void playGame() {


        rockBtn.addActionListener((ActionEvent ae) -> {
            int playerPic = 1; //rock
            resultsArea.append(calculateResults(playerPic));
        });

        paperBtn.addActionListener((ActionEvent ae) -> {
            int playerPic = 2;
            resultsArea.append(calculateResults(playerPic));
        });
        scissorsBtn.addActionListener((ActionEvent ae)-> {
            int playerPic = 3;
            resultsArea.append(calculateResults(playerPic) + "\n");
        });

   /* private void calculateResults() {

    } */


}
