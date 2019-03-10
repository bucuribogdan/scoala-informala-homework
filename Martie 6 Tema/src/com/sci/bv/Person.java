package com.sci.bv;

import java.time.LocalDate;
import java.util.Date;

/**
 * This is the list created with the people in the input file.
 */
public class Person {
    public String lastName;
    public String firstName;
    public String birthDate;
    public String monthBirthDate;

    public Person(String line) {
        String[] split = line.split(",");
        firstName = split[0];
        lastName = split[1];
        birthDate = split[2];
        monthBirthDate = "-";
    }

    public void setMonthBirthDate(String monthBirthDate) {
        this.monthBirthDate = monthBirthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getMonthBirthDate() {
        return monthBirthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    //Split the date of birth into 3 parts to get the birth month.
    public String getBirthMonth(String birthDate) {
        String[] parts = getBirthDate().split("/");
        String dayBirthDate = parts[0];
        String monthBirthDate = parts[1];
        String yearBirthDate = parts[2];
        return monthBirthDate;
    }
}
