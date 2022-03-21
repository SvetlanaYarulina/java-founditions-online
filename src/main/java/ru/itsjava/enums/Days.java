package ru.itsjava.enums;

public enum Days {
    Monday ("понедельник"), Tuesday ("вторник"), Wednesday("среда"),
    Thursday("четверг"),Friday("пятница"),Saturday("суббота"),
    Sunday("воскресенье");

    private final String characteristic;

    Days(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String toString() {
        return "Days {" + this.name() +
                " (characteristic='" + characteristic + ")}";
    }
}
