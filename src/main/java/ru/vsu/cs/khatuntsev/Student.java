package ru.vsu.cs.khatuntsev;

import java.util.Objects;

public record Student(String recordBookId, String fullName, Group group) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        return this.recordBookId.equals(student.recordBookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordBookId);
    }
}
