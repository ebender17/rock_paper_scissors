import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissorsFrame extends JFrame {

    //Score count
    int playerWins = 0;
    int computerWins = 0;
    int ties = 0;

    //Labels
    JLabel mainLabel = new JLabel("Rock Paper Scissors");
    JLabel playerWinsLabel = new JLabel("Player Wins: ");
    JLabel computerWinsLabel = new JLabel("Computer Wins: ");
    JLabel tiesLabel = new JLabel("Ties: ");

    //JTextFields
    JTextField playerWinsField = new JTextField(1);
    JTextField computerWinsField = new JTextField(1);
    JTextField tiesField = new JTextField(1);

    //Panels
    JPanel mainPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JPanel statsPanel = new JPanel();
    JPanel resultsPanel = new JPanel();

    //Text area and scroll pane
    JTextArea resultsArea = new JTextArea(3, 40);
    JScrollPane resultsScroll = new JScrollPane(resultsArea);


    //Buttons
    JButton rockBtn = new JButton(new ImageIcon("img/rock_hand.png"));
    JButton paperBtn = new JButton(new ImageIcon("img/paper_hand.png"));
    JButton scissorsBtn = new JButton(new ImageIcon("img/scissors_hand.png"));
    JButton quitBtn = new JButton("Quit");

    //Border & Border Layout
    Border blackline = BorderFactory.createLineBorder(Color.DARK_GRAY);
    BoxLayout mainPanelLayout = new BoxLayout(mainPanel,BoxLayout.Y_AXIS);
    BoxLayout boardPanelLayout = new BoxLayout(boardPanel, BoxLayout.X_AXIS);
    GridLayout statsPanelLayout = new GridLayout(1, 3);


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
        mainPanel.add(mainLabel);
        mainPanel.add(boardPanel);
        mainPanel.add(statsPanel);
        mainPanel.add(resultsPanel);

        //button size
        rockBtn.setPreferredSize(new Dimension(200, 75));

        //add buttons to board panel
        boardPanel.add(rockBtn);
        boardPanel.add(paperBtn);
        boardPanel.add(scissorsBtn);
        boardPanel.add(quitBtn);

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
        playGame();


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
            resultsArea.append(calculateResults(playerPic));
        });


    }


    public String calculateResults(int playerPic) {
        Random random = new Random();
        int computerPic = random.nextInt(3) + 1;

        String result = "";

        switch (playerPic) {
            case 1: {
                if (computerPic == 1) {
                    ties++;
                    tiesField.setText(String.valueOf(ties));
                    result = "It is a tie \n";

                } else if (computerPic == 2) {
                    computerWins++;
                    computerWinsField.setText(String.valueOf(computerWins));
                    result = "Paper covers Rock (Computer Wins) \n";
                } else if (computerPic == 3) {
                    playerWins++;
                    playerWinsField.setText(String.valueOf(playerWins));
                    result = "Rock breaks Scissors (Player Wins) \n";
                }
            }
            break;
            case 2: {
                if (computerPic == 1) {
                    playerWins++;
                    playerWinsField.setText(String.valueOf(playerWins));
                    result="Paper covers Rock (Player Wins) \n";

                } else if (computerPic == 2) {
                    ties++;
                    tiesField.setText(String.valueOf(ties));
                    result = "It is a tie";
                } else if (computerPic == 3) {
                    computerWins++;
                    computerWinsField.setText(String.valueOf(computerWins));
                    result = "Scissor cuts Paper (Computer Wins) \n";

                }
            }
            break;
            case 3: {
                if (computerPic == 1) {
                    computerWins++;
                    computerWinsField.setText(String.valueOf(computerWins));
                    result = "Rock beats Scissor (Computer Wins) \n";

                } else if (computerPic == 2) {
                    playerWins++;
                    playerWinsField.setText(String.valueOf(playerWins));
                    result = "Scissor cuts Paper (Player Wins) \n";
                } else if (computerPic == 3) {
                    ties++;
                    tiesField.setText(String.valueOf(ties));
                    result = "It is a tie \n";
                }
            }
            break;




        }
        return result;
    }



}
