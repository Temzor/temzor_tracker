package ru.job4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when01and40and04Then8() {
        Point a = new Point(5, 5);
        Point b = new Point(4, 4);
        Point c = new Point(4, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}