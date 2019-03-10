package com.sci.bv;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * This program is reading from a .txt file the first name, last name and the birth date.
 * After the file have been read, are selected the persons born in the indicated month
 * and is creating a new .txt file (result) where selected persons are ordered alphabetically
 * for all the of all matches which have the birthday on a month indicated.
 */

public class Main {

    /**
     * @param args indicatedMonth is the given month to sort people born in this month
     *             and according to which the new file is written.
     * @param args "input.txt"    is the name of the file which is read and analyzed.
     * @param args "output.txt"   is a new file (result) in which the names of the people
     *             born in the given month are written.
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:\\Users\\Bogdan\\Desktop\\SCI\\Martie 6 Tema\\src\\com\\sci\\bv\\files\\input.txt"))) {

            // List to collect Person objects.
            List<Person> persons = new ArrayList<Person>();
            String indicatedMonth = "04";
            int x = 0;

            // Read file line by line.
            String line = "";
            while ((line = br.readLine()) != null) {

                // Create new Person object.
                Person person = new Person(line);

                // Add object to list.
                persons.add(person);

                //Is adding the birth month in list.
                person.setMonthBirthDate(person.getBirthMonth(person.getBirthDate()));

                //Count how many people are born in the indicated month
                if (person.getBirthMonth(person.getBirthDate()).equals(indicatedMonth))
                    x++;

            }
            //Create new file where the persons borned in indicatedMonth will be write.
            PrintWriter writer = new PrintWriter(
                    "C:\\Users\\Bogdan\\Desktop\\SCI\\Martie 6 Tema\\src\\com\\sci\\bv\\files\\output.txt");
            persons
                    .stream()

                    //Filter the input file according to the person's birth month.
                    .filter(s -> indicatedMonth.equals(s.getMonthBirthDate()))

                    //Sorts alphabetically the list of people by first name.
                    .sorted(Comparator.comparing(Person::getFirstName))

                    //Write the new file with people born in indicatedMonth in alphabetical order.
                    .forEach(s -> {
                        writer.write(s.firstName + "," + s.lastName);
                        writer.println();
                    });
            writer.close();
            if (x == 0)
                throw new IllegalArgumentException("Are not persons born in indicated month!");
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found! Check again the file path/file name.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}