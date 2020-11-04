package ikab.dev;

public class Mastermind {

    private final Game game;

    public Mastermind() {
        this.game = new Game();
    }

    public void play() {
        do {
            String proposedCombination = readProposedCombination();
            game.playCombination(new ProposedCombination(proposedCombination.toCharArray()));
            game.presentCurrentAttempt();
            game.nextAttempt();
        } while (game.isContinuePlaying());
        game.close();
    }

    private String readProposedCombination() {
        String combination;
        do {
            combination = new ConsoleReader().readProposedCombination();
        } while (isValidFormatProposedCombination(combination));
        return combination;
    }

    private boolean isValidFormatProposedCombination(String combination) {
        //todo validate formato of the combination read by console
        return false;
    }

}