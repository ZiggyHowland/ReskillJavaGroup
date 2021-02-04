package src.dnb.reskill.knut.TicTacToe;

import java.util.HashMap;



public class Gameboard {


    private HashMap<String, String> gameMap = new HashMap<>();

    public HashMap<String, String> getGameMap() {
        return gameMap;
    }


    //method to populate hashmap (gameboard)
    public void hashmap() {

        gameMap.put("a1", "_");
        gameMap.put("a2", "_");
        gameMap.put("a3", "_");
        gameMap.put("b1", "_");
        gameMap.put("b2", "_");
        gameMap.put("b3", "_");
        gameMap.put("c1", "_");
        gameMap.put("c2", "_");
        gameMap.put("c3", "_");


    }


    //displays current gameboard, including updates from editBoard
    public String printBoardAsString() {


        return String.format("\n  A B C \n1 %s %s %s \n2 %s %s %s \n3 %s %s %s \n",
                gameMap.get("a1"), gameMap.get("b1"), gameMap.get("c1"),
                gameMap.get("a2"), gameMap.get("b2"), gameMap.get("c2"),
                gameMap.get("a3"), gameMap.get("b3"), gameMap.get("c3"));

    }




//updates the board according to user input.
// Also: Checks for wincondition

    public String editBoard (String select, String playerSymbol){
            gameMap.replace(select, playerSymbol);

        String x = checkIfVictory(printBoardAsString());
        if (x != null) return x;

            return printBoardAsString();
    }


    

    //checks for three in a row:

//check if a1, a2, a3 is the same
    private String checkIfVictory(String board) {
        if (gameMap.get("a1") == (gameMap.get("a2"))) {
            if (gameMap.get("a2") == gameMap.get("a3") && gameMap.get("a2") != ("_")) {
                System.out.println(board);
                return ("Victory");
            }
        }

//check of b1, b2, b3
        if (gameMap.get("b1") == (gameMap.get("b2"))) {
            if (gameMap.get("b2") == gameMap.get("b3") && gameMap.get("b2") != ("_")) {
                System.out.println(board);
                return ("Victory");
            }
        }


//check of c1 - c3
        if (gameMap.get("c1") == (gameMap.get("c2"))) {
            if (gameMap.get("c2") == gameMap.get("c3") && gameMap.get("c2") != ("_")) {
                System.out.println(board);
                return ("Victory");
            }
        }

//check of a1, b1, c1
        if (gameMap.get("a1") == (gameMap.get("b1"))) {
            if (gameMap.get("b1") == gameMap.get("c1") && gameMap.get("b1") != ("_")) {
                System.out.println(board);
                return ("Victory");
            }
        }

//check of a2, b2, c2
        if (gameMap.get("a2") == (gameMap.get("b2"))) {
            if (gameMap.get("b2") == gameMap.get("c2") && gameMap.get("b2") != ("_")) {
                System.out.println(board);
                return ("Victory");
            }
        }

//check of a3, b3, c3
        if (gameMap.get("a3") == (gameMap.get("b3"))) {
            if (gameMap.get("b3") == gameMap.get("c3") && gameMap.get("b3") != ("_")) {
                System.out.println(board);
                return ("Victory");

            }
        }


//check of a1, b2, c3
        if (gameMap.get("a1") == (gameMap.get("b2"))) {
            if (gameMap.get("b2") == gameMap.get("c3") && gameMap.get("b2") != ("_")) {
                System.out.println(board);
                return ("Victory");
            }
        }


//check of a3, b2, c1
        if (gameMap.get("a3") == (gameMap.get("b2"))) {
            if (gameMap.get("b2") == gameMap.get("c1") && gameMap.get("b2") != ("_")) {
                System.out.println(board);
                return ("Victory");
            }
        }


        return null;
    }






}






