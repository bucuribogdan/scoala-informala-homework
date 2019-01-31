package com.sci.bv.tema9Ianuarie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problema3Test {
    Problema3 timp = new Problema3();

    @Test
    void hour() {
        Assertions.assertEquals(timp.Hour(12),12);
    }

    @Test
    void minute() {
        Assertions.assertEquals(timp.Minute(12),12);
    }
}