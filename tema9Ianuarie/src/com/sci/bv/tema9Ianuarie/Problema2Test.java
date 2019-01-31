package com.sci.bv.tema9Ianuarie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problema2Test {
    Problema2 grade= new Problema2();

    @Test
    void getCelsius() {
        Assertions.assertEquals(grade.getCelsius(50),10);
    }
}