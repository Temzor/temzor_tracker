package ru.job4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
    @Test
    void whenPositivePoint() {
        Point a = new Point(1, 18);
        Point b = new Point(12, 25);
        assertThat(a.distance(b)).isEqualTo(13, withPrecision(2d));

    }

    @Test
    void whenNegativePoint() {
        Point a = new Point(-1, -20);
        Point b = new Point(-32, -58);
        assertThat(a.distance(b)).isEqualTo(49, withPrecision(2d));
    }

}