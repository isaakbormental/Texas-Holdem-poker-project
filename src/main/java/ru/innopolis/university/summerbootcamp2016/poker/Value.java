package ru.innopolis.university.summerbootcamp2016.poker;

public enum Value {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int suitValue;

    private Value (int suitValue)
    {
        this.suitValue = suitValue;
    }

    public int getSuitValue()
    {
        return suitValue;
    }
}