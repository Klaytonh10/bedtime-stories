package org.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {


        try {
            FileReader fileReader1 = new FileReader("src/main/resources/goldilocks.txt");
            FileReader fileReader2 = new FileReader("src/main/resources/hansel_and_gretel.txt");
            FileReader fileReader3 = new FileReader("src/main/resources/mary_had_a_little_lamb.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader1);
           //


        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}