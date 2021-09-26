package by.epamtc.lab1.task13.util;

import java.util.Objects;

public class ProgrammerBook {
    private String language;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammerBook that = (ProgrammerBook) o;
        return level == that.level &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return 31*level+Objects.hash(language);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "language='" + language +
                ", level=" + level +
                '}';
    }
}
