package ikab.dev;

public class Game {

    private int attemptsCounter;
    private Attempt currentAttempt;
    private final SecretCombination secretCombination;

    public Game() {
        attemptsCounter = 0;
        secretCombination = new SecretCombination();
    }

    public void playCombination(ProposedCombination proposedCombination) {
        currentAttempt =  new Attempt(proposedCombination);
    }

    public void presentCurrentAttempt() {
        GamePresenter.printAttemptsCount();
        GamePresenter.printAttemptTitle();
        GamePresenter.printWhites(currentAttempt.getWhites(secretCombination));
        GamePresenter.printBlacks(currentAttempt.getBlacks(secretCombination));
    }


    public void nextAttempt() {
        attemptsCounter++;
    }

    public boolean isContinuePlaying() {
        return attemptsCounter < 10 || !currentAttempt.isWinnerAttempt(secretCombination);
    }

    public boolean isWinnerGame() {
        return currentAttempt.isWinnerAttempt(secretCombination);
    }

    public void close() {

    }
}
