package jc1_homework.pack5.pract38;

public enum Month {
    DECEMBER(31),
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(30),
    SEPTEMBER(31),
    OCTOBER(30),
    NOVEMBER(31);

    public final int number;

    Month(int number) {
        this.number = number;
    }
}
