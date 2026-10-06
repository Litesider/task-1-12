package ru.vsu.cs.khatuntsev;

import java.util.ArrayList;
import java.util.List;

public class PerformanceRecord {
    private static final int MAX_ATTEMPTS = 3;

    private final List<Attempt> attempts = new ArrayList<>();

    public void addAttempt(Attempt attempt) {
        if (attempts.size() >= MAX_ATTEMPTS) {
            throw new RetakeLimitExceededException("Превышен лимит пересдач (максимум " + MAX_ATTEMPTS + ")");
        }
        attempts.add(attempt);
    }

    public List<Attempt> getAttempts() {
        return List.copyOf(attempts);
    }

    public Attempt getLastAttempt() {
        if (attempts.isEmpty()) {
            return null;
        }
        return attempts.getLast();
    }
}
