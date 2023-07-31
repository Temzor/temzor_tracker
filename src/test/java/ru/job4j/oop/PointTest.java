package ru.job4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
    @Test
    void whenPositivePoint2D() {
        Point a = new Point(1, 18);
        Point b = new Point(12, 25);
        assertThat(a.distance(b)).isEqualTo(13, withPrecision(2d));

    }

    @Test
    void whenNegativePoint2D() {
        Point a = new Point(-1, -20);
        Point b = new Point(-32, -58);
        assertThat(a.distance(b)).isEqualTo(49, withPrecision(2d));
    }

    @Test
    void whenPositivePoint3D() {
        Point a = new Point(1, 18, 22);
        Point b = new Point(12, 25, 31);
        assertThat(a.distance3d(b)).isEqualTo(15, withPrecision(2d));

    }

    @Test
    void whenNegativePoint3D() {
        Point a = new Point(-1, -20, -45);
        Point b = new Point(-32, -58, -89);
        assertThat(a.distance(b)).isEqualTo(49, withPrecision(2d));
    }

}