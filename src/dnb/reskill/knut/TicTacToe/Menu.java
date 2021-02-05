package dnb.reskill.knut.TicTacToe;

import java.util.Scanner;

// ANDY: Generally, comments should be indented to the same level as the code.
public class Menu {

    //can hashmap() on line 20 be included in the constructor?
    // ANDY: Yes it is now. So I've commented-out your call to hashmap() in the mainMenu() function.
    // ANDY: ALso I;ve made all these fields private, for consistency.
    private Gameboard gameboard = new Gameboard();
    private Scanner input = new Scanner(System.in);
    private String player = "Player 1";
    private String playerSymbol = "X";

    public void mainMenu() {

        // Load data into hashmap (gameboard)
        // ANDY: No need for following function call - the constructor does the initialization instead.
        // gameboard.hashmap();

        printGameInstructions();

        boolean activeMenu = true;
        System.out.println(gameboard.printBoardAsString());
        while (activeMenu) {

            boolean menuLoop = true;
            int i = 2;
            while (menuLoop) {

//        if turncount is even: player 1, if odd: player 2
                if (i % 2 == 0){
                    setPlayer("Player 1");
                    setPlayerSymbol("X");
                }
                else{
                    setPlayer("Player 2");
                    setPlayerSymbol("O");
                }

                System.out.printf("%s, enter your choice: ", player);
                String select = input.next().toLowerCase();

                // ANDY: Maybe you could move sone of this code to a separate method, to make this code here shorter.
//  checks if input is a valid input and not already taken.
                if (gameboard.checkIfInputIsValid(select) == false){
                    System.out.printf("%s is not a valid choice, try again.\n", select);
                    i--;

                } else {
                    System.out.println("You selected " + select);
                    String updateBoard = gameboard.editBoard(select, playerSymbol);

                    System.out.println(updateBoard);
                    if (updateBoard == ("Victory")) {
                        System.out.printf("\nCongratulations %s! \nThree %s's in a row.\n", player, playerSymbol);
                        menuLoop = false;
                        break;
                    }
                    if (updateBoard == ("Draw")) {
                        menuLoop = false;
                        break;
                    }
                }
                i++;
            }
            System.out.println("\nGAME OVER");
            break;
//no further menu options at this point
        }
    }

    public void printGameInstructions() {
        System.out.println("Welcome to this Tic-Tac-Toe game!\n \n" +
                "Please type the field you select (i.e. c3 for the bottom right corner.\n" +
                "\nPlayer 1 goes first, then player 2.\n");

    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setPlayerSymbol(String playerSymbol) {
        this.playerSymbol = playerSymbol;
    }
}


