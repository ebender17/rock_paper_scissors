# Assignment 5 - Rock Paper Scissors
## Assignment Self Assessment:
#### Reflection
[//]: <> (share your thoughts on the assignment, things you learnt and would like to remember when you look back at this assignment)
Assignment completed for Computer Programming II. 

#### Self Assessment
- [X] The program runs with no errors.
- [X] Create the GUI form.
- [X] Logic is sound.
- [X] Proper usage of Git and GitHub (frequent commits, explanatory commit messages)


**Your Grade:**  20/20

______________________________________________________________________

## Lab Goals:
1. Get practice with using the Java GUI methods.

## Discussion:
**Review of the how the game is played (Just in case 😄)**

This is a two player game. (Here the computer is the second player.)
Each player simultaneously picks one of the three gestures:
  1. Rock ( A closed fist)
  2. Paper ( an open hand)
  3. Scissors (first two fingers extended like scissors)
Each game is decided by the following rules:
  • Rock breaks scissors (Rock wins)
  • Paper covers rock (Paper wins)
  • Scissors covers paper (Scissors wins)
  • If both players choose the same gesture it is a tie

## Final Result:
You will be submitting a git repository with the following naming
convention, `6-rock-paper-scissorts-gui-<your-github-username>`, (i.e., `6-rock-paper-scissorts-gui-Ygilany`). The repository contains:
1. one Java Project with the following files:
    - RockPaperScissorsFrame.java (JFrame extended class)
    - RockPaperScissorsRunner.java (has a main method)
2. a modified README.md file that includes your self-assessment

----

## Instructions
1. Create a Java Swing GUI applicaton called RockPaperScissorsGUI.
  - Your project will have a RockPaperScissorsFrame.java class (which inherits from
JFrame) and a java main class: RockPaperScissorsRunner.java.

2. The project has the following GUI components:
    * A title for your game’s frame “Rock Paper Scissors Game” or some such.
    * A JPanel with three JButton components for Rock, Paper, Scissors, and an additional JButton for Quitting the game.
        * Put a border around this panel.
        * Each should have an appropriate ImageIcon. Your images HAS TO BE in the project files.
        * And use relative paths not absolute path. When sharing a project with other developers, a path such as `C://Users/YourName/Documents/image.jpg` would not work for us.
    - A stats panel with 3 JLabels and JTextFields (Player Wins, Computer Wins, Ties) each should have the count of the wins etc.
    - A panel with a `JTextArea` with `JScrollPane` that displays the results of each game one per line as a text string: Rock breaks scissors (Player wins) or Paper covers Rock (Computer Wins) This should accumulate and display the results for each game in the session, one per line, not just show the results for the last game played. (In other words, you can scroll through all of the game results for the session.)

3. The player will click on one of the buttons to play the game. The computer will randomly determine which symbol it will use and then determine the results. The JTextArea will be updated with the results display string. One line for each game. The stats panel keeping track of the computer and player wins and the ties should also be updated and should show a running total for all the games played during the session.

4. The game continues until the player closes the application window or presses the Quit key.

Thoroughly test your game making sure that everything works correctly. Try for a nice looking
layout.

## Grading
1. The program runs with no errors.
2. Created a GUI application.
3. Logic is sound.
4. Proper usage of Git and GitHub (frequent commits, explanatory commit messages)
