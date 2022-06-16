package ru.geekbrains.lesson5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.Integer;
import java.io.Serializable;


public class AppData {

    public static void main(String args[]) {
        try (PrintWriter writer = new PrintWriter("data.csv")) {
            StringBuilder dt = new StringBuilder();

            dt.append("value1");
            dt.append("value2");
            dt.append("value3");
            dt.append("\n");
            dt.append("123");
            dt.append("456");
            dt.append("789");
            dt.append("\n");
            dt.append("987");
            dt.append("654");
            dt.append("321");
            dt.append("\n");
            writer.write(dt.toString());
        } catch (FileNotFoundException e) {
        }
    }
        public static void main(String args) {

            String csvFile = "data.csv";
            String line = "";
            String cvsSplitBy = ";";

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

                while ((line = br.readLine()) != null) {


                    String[] country = line.split(cvsSplitBy);

                    System.out.println(br);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }