package Lesson39;

public enum DayOfWeek {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");

    private String russianDayOfWeek;

    DayOfWeek(String russianDayOfWeek){
        this.russianDayOfWeek=russianDayOfWeek;
    }

    public String getRussianDayOfWeek() {
        return russianDayOfWeek;
    }
}
