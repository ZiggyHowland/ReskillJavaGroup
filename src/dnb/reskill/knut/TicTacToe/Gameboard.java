package dnb.reskill.knut.TicTacToe;

import java.util.HashMap;


// ANDY: Generally this class looks good. A few specific points, see my comments. 
// Be a bit more frugal with the amount of blanks lines, and be more consistent with indentation. I've fixed bits where I can.
public class Gameboard {

    private HashMap<String, String> gameMap = new HashMap<>();
    private HashMap<Integer, String> checkIfVictoryList = new HashMap<>();

    public HashMap<String, String> getGameMap() {
        return gameMap;
    }

    // ANDY: This used to be the hashmap() function, it's better to do this in the constructor when the object is created.
    //hashmap (gameboard) is populated
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

    public HashMap<Integer, String> getCheckIfVictoryList() {
        return checkIfVictoryList;
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

        String givesReturnIfVictory = checkIfVictory(printBoardAsString());

        if (givesReturnIfVictory != null)
            return givesReturnIfVictory;
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
    private String checkIfVictory(String board) {

        comparisonWinCondition();

        for (int i = 1; i < 8; i=i+3) {

            if (checkIfVictoryList.get(i+0).equals(checkIfVictoryList.get(i+1))) {
                if (checkIfVictoryList.get(i+1).equals(checkIfVictoryList.get(i+2))) {
                    if (!checkIfVictoryList.get(i+1).equals("_")) {
                        System.out.println(board);
                        System.out.println("it works!");
                        return ("Victory");
                    }
                }
            }
        }


        //check if draw
        if (!gameMap.containsValue("_")){
            return ("Draw");
        }
        return null;
    }

    private void comparisonWinCondition() {

        //list of possible win positions, in sets of threes (ie 1-3, 4-6, ..)

        checkIfVictoryList.put(1, gameMap.get("a1"));
        checkIfVictoryList.put(2, gameMap.get("a2"));
        checkIfVictoryList.put(3, gameMap.get("a3"));
        checkIfVictoryList.put(4, gameMap.get("b1"));
        checkIfVictoryList.put(5, gameMap.get("b2"));
        checkIfVictoryList.put(6, gameMap.get("b3"));
        checkIfVictoryList.put(7, gameMap.get("c1"));
        checkIfVictoryList.put(8, gameMap.get("c2"));
        checkIfVictoryList.put(9, gameMap.get("c3"));
        checkIfVictoryList.put(10, gameMap.get("a1"));
        checkIfVictoryList.put(11, gameMap.get("b1"));
        checkIfVictoryList.put(12, gameMap.get("c1"));
        checkIfVictoryList.put(13, gameMap.get("a2"));
        checkIfVictoryList.put(14, gameMap.get("b2"));
        checkIfVictoryList.put(15, gameMap.get("c2"));
        checkIfVictoryList.put(16, gameMap.get("a3"));
        checkIfVictoryList.put(17, gameMap.get("b3"));
        checkIfVictoryList.put(18, gameMap.get("c3"));
        checkIfVictoryList.put(19, gameMap.get("a1"));
        checkIfVictoryList.put(20, gameMap.get("b2"));
        checkIfVictoryList.put(21, gameMap.get("c3"));
        checkIfVictoryList.put(22, gameMap.get("c3"));
        checkIfVictoryList.put(23, gameMap.get("b2"));
        checkIfVictoryList.put(24, gameMap.get("c1"));

        String [] vicList = ()
    }
}






