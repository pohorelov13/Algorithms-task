package demo;

import java.util.Objects;

public class TestElements implements Comparable<TestElements> {
    private final int value;
    private final String name;

    public TestElements(String name, int value) {
        this.value = value;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestElements that = (TestElements) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(TestElements o) {
        return value - o.value;
    }
}