package com.sci.bv.tema9Ianuarie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    Main Max = new Main();

    @Test
    void getMax() {
        Assertions.assertEquals(Max.getMax(5, 10), 10);
    }

}