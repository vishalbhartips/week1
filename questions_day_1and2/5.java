package questions_day_1and2;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class Drive {
    public static void main(String[] args) {
        String dayOfWeek = "FRIDAY";
        Day weekday = Day.valueOf(dayOfWeek);
        System.out.println(weekday);
    }
}

