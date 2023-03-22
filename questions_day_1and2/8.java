package questions_day_1and2;

enum Color {
    RED("FF0000", "Red"),
    GREEN("00FF00", "Green"),
    BLUE("0000FF", "Blue");

    private String hexCode;
    private String colorName;

    private Color(String hexCode, String colorName) {
        this.hexCode = hexCode;
        this.colorName = colorName;
    }

    public String getHexCode() {
        return hexCode;
    }

    public String getColorName() {
        return colorName;
    }
}

class EnumDemo {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1.getColorName() + " (" + c1.getHexCode() + ")");
    }
}

