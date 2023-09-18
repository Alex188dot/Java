package Abstraction_Exercise;

public abstract class Result {
    int player1;
    int player2;


    public Result(int player1, int player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public abstract void calculate();
}
