package natwest.com.model;

public class Player {

    private String name;
    private Move move;
    private Result result;

    public Player(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
