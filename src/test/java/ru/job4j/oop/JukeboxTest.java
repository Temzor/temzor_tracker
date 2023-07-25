package ru.job4j.oop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JukeboxTest {
    @Test
    void hybridTestJukebox() {
        Jukebox jukebox = new Jukebox();
        assertThat(jukebox).isNotNull();
    }

}