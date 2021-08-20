package com.jpmc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ThrowsKeyword {
    public static void main(String[] args) throws Exception /*throws IOException*/ {
        try {
            readFromFile();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        doSomething();
    }

    public static void doSomething() throws Exception {

    }

    private static void readFromFile() throws IOException {
        //try {
            Files.readAllLines(Paths.get("./folder")); //Checked exception
        //}
        //catch(IOException ex) {
        //  System.out.println(ex.getMessage());
        //}

    }
}
