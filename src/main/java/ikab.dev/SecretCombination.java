package ikab.dev;

import java.util.List;

public class SecretCombination extends Combination {

    public SecretCombination() {
        this.setColors(getRandomColors());
    }

    private List<Color> getRandomColors() {
        return List.of(Color.BLUE, Color.RED, Color.ORANGE, Color.YELLOW);
    }

    public boolean isCorrectCombination(Combination proposedCombination) {
        return this.equals(proposedCombination);
    }

    public int getWhites(Combination proposedCombination) {
        int whites = 0;
        for (int i = 0; i < this.getColors().size(); i++) {
            if (this.getColors().get(i).equals(proposedCombination.getColors().get(i))) {
                whites++;
            }
        }
        return whites;
    }

    public int getBlacks(Combination proposedCombination) {
        int blacks = 0;
        for (Color color : proposedCombination.getColors()) {
            if (this.getColors().contains(color)) {
                blacks++;
            }
        }
        return blacks;
    }

}
