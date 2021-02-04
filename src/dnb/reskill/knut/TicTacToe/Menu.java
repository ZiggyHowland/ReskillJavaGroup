package src.dnb.reskill.knut.TicTacToe;

import java.util.Scanner;

public class Menu {

    // --> hashmap mehod on line 23 can be included in the constructor
    // how to do this in an efficient way?

    Gameboard gameboard = new Gameboard();



    Scanner input = new Scanner(System.in);

    private String player = "Player 1";
    private String playerSymbol = "X";



    public void mainMenu() {


        //load data into hashmap (gameboard)
        gameboard.hashmap();


        printGameInstructions();


        boolean activeMenu = true;
        System.out.println(gameboard.printBoardAsString());


        while (activeMenu) {

            boolean menuLoop = true;

            int i = 2;

            while (menuLoop) {

//        if turncount is even: player 1s turn, if odd: player 2
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

//get rid of getgamemethod --> streamline.  make method: is valid choice?
                if (!gameboard.getGameMap().containsKey(select)) {
                    System.out.printf("%s is not a valid choice, try again.", select);

                } else {
                    System.out.println("You selected " + select);
                    String updateBoard = gameboard.editBoard(select, playerSymbol);

                    System.out.println(updateBoard);
                    if (updateBoard == ("Victory")) {
                        menuLoop = false;
                        break;
                    }
                }

                i++;

            }
            System.out.println("\nThree in a row.\nGAME OVER");
            break;
//no further menu options at this point


        }
    }





    public void printGameInstructions() {
        System.out.println("Welcome to this Tic-Tac-Toe game!\n\n" +
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


