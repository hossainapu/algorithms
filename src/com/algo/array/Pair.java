package com.algo.array;

import java.util.Objects;

public final class Pair<U, V> {

    private final U first;
    private final V second;

    // Private constructor to enforce use of factory method
    private Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    // Factory method
    public static <U, V> Pair<U, V> of(U first, V second) {
        return new Pair<>(first, second);
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }
}
