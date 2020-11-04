package ikab.dev;

public class ProposedCombination extends Combination {

    public ProposedCombination(char[] colors) {
        for (char colorCode : colors) {
            this.getColors().add(getColorFrom(colorCode));
        }
    }

    private Color getColorFrom(char colorCode) {
        //todo get Color form colorCode
        return Color.RED;
    }

}