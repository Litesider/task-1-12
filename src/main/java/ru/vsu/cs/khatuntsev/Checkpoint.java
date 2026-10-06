package ru.vsu.cs.khatuntsev;

public sealed interface Checkpoint permits Attestation, Exam{
    String name();
    double getWeight();
}
