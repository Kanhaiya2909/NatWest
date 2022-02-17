package natwest.com.model;

import java.util.UUID;

/**
 * Representation of game
 */

public class Game {

    private UUID gameID;
    private State gameState;
    private Player player1;
    private Player player2;


    public Game(State gameState) {

        this.gameID = generateUUID();
        this.gameState = gameState;
    }

    public UUID generateUUID() {
        return UUID.randomUUID();
    }

    public UUID getGameID() {
        return gameID;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public State getGameState() {
        return gameState;
    }

    /**
     * Creates a String representation of the current game state
     * @return String representation of the current game state
     */
    @Override
    public String toString() {


        return "GameId: " + gameID +
                "\nGame state: " + gameState +
                "\nPlayer 1: " + player1.getName() +
                "\nPlayer 1 move: " + player1.getMove() +
                "\nPlayer 2: " + player2.getName() +
                "\nPlayer 2 move: " + player2.getMove() +
                "\nRESULT: " + "Player 1 - " + player1.getResult() + ", Player 2 - " + player2.getResult() + "\n";
    }

   
    public void evaluateMoves(Player player1, Player player2) {

        if (player1.getMove().equals(player2.getMove())) {

            player1.setResult(Result.DRAW);
            player2.setResult(Result.DRAW);
        }

        else if (player1.getMove().winsOver(player2.getMove())) {
            player1.setResult(Result.WIN);
            player2.setResult(Result.LOSE);
        }
        else {
            player2.setResult(Result.WIN);
            player1.setResult(Result.LOSE);
        }

        gameState = State.ENDED;
    }
}
