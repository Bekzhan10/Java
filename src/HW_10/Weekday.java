package HW_10;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public  boolean isHoliday(Weekday day) {
            return day == SATURDAY || day == SUNDAY;
    }
}
