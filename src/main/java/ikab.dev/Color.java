package ikab.dev;

public enum Color {

    RED('r'),
    BLUE('b'),
    YELLOW('y'),
    GREEN('g'),
    ORANGE('o'),
    PINK('p');

    private final char colorCode;

    Color(char colorCode) {
        this.colorCode = colorCode;
    }

    public Color of(char colorCode) {
        //todo return Color by char
        return Color.RED;
    }

    public boolean isValidColor(char color) {
        //todo check if is valid color
        return false;
    }

    public char getColorCode() {
        return colorCode;
    }
}
