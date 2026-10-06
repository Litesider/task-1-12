package ru.vsu.cs.khatuntsev;

public record Exam(String name, double weight) implements Checkpoint {
    @Override
    public double getWeight() {
        return weight;
    }
}
