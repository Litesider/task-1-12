package ru.vsu.cs.khatuntsev;

public enum Grade {
    FIVE(90, 100),
    FOUR(70, 89),
    THREE(50, 69),
    TWO(0, 49);

    private final int minScore;
    private final int maxScore;

    Grade(int minScore, int maxScore) {
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public static Grade fromScore(int score) {
        for (Grade grade : values()) {
            if (score >= grade.minScore && score <= grade.maxScore) {
                return grade;
            }
        }
        throw new IllegalArgumentException("Неверный балл: " + score);
    }
}
