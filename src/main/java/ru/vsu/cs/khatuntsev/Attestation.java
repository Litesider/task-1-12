package ru.vsu.cs.khatuntsev;

public record Attestation(String name) implements Checkpoint {
    @Override
    public double getWeight() {
        return 1.0;
    }
}
