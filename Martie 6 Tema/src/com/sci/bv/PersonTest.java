package com.sci.bv;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person birthm = new Person("Bogdan,Bucur,29/12/1993");

    @org.junit.jupiter.api.Test
    void getBirthMonth() {
        Assertions.assertEquals(birthm.getBirthMonth("29/12/1993"), "12");
    }
}