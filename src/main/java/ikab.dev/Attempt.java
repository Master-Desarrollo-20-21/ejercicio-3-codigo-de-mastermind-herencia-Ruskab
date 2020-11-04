package ikab.dev;

public class Attempt {

    private ProposedCombination proposedCombination;

    public Attempt(ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    public boolean isWinnerAttempt(SecretCombination secretCombination) {
        return secretCombination.isCorrectCombination(proposedCombination);
    }

    public int getWhites(SecretCombination secretCombination) {
        return secretCombination.getWhites(proposedCombination);
    }

    public int getBlacks(SecretCombination secretCombination) {
        return secretCombination.getBlacks(proposedCombination);
    }



}
