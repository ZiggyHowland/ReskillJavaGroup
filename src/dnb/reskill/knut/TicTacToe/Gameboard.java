package src.dnb.reskill.knut.TicTacToe;

import java.util.HashMap;

// ANDY: Generally this class looks good. A few specific points, see my comments. 
// Be a bit more frugal with the amount of blanks lines, and be more consistent with indentation. I've fixed bits where I can.
public class Gameboard {

    private HashMap<String, String> gameMap = new HashMap<>();

    public HashMap<String, String> getGameMap() {
        return gameMap;
    }

    // ANDY: This used to be the hashmap() function, it's better to do this in the constructor when the object is created.
    public Gameboard() {
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

    // ANDY: I tweaked your comment.
    // Returns a string for the current gameboard, including updates from editBoard
    public String printBoardAsString() {
        return String.format("\n  A B C \n1 %s %s %s \n2 %s %s %s \n3 %s %s %s \n",
                gameMap.get("a1"), gameMap.get("b1"), gameMap.get("c1"),
                gameMap.get("a2"), gameMap.get("b2"), gameMap.get("c2"),
                gameMap.get("a3"), gameMap.get("b3"), gameMap.get("c3"));
    }

    //updates the board according to user input.
    // Also: Checks for wincondition
    public String editBoard (String select, String playerSymbol) {
        gameMap.replace(select, playerSymbol);
        
        // ANDY: Use a better variable name than x, to explain what it is. 
        String x = checkIfVictory(printBoardAsString());
        
        // ANDY: Generally, more readable to put return statement on a separate line.
        if (x != null) 
            return x;
        else
            return printBoardAsString();
    }


    public boolean checkIfInputIsValid(String input){
        if (!getGameMap().containsKey(input)){
            return false;
        }
        if ((gameMap.get(input).equals("X") || gameMap.get(input).equals("O"))){
            return false;
        }
        else {
            return true;
        }
    }

    //checks for three in a row:

    // ANDY: I can't help thinking there might be some way to avoid a bit of the duplication in this method (to a certian extent, at least...)
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

        //check if draw
        if (!gameMap.containsValue("_")){
            return ("Draw");
        }
        return null;
    }
}






