package ru.job4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {
    @Test
    void checkClassStudent() {
        Student student = new Student();
        assertThat(student).isNotNull();
        assertThat(student.getClass()).isEqualTo(student.getClass());
    }

}