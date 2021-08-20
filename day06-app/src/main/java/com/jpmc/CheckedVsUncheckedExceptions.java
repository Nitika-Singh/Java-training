package com.jpmc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckedVsUncheckedExceptions {
    public static void main(String[] args) {
        //NPE, ArrayIndex, Arithmetic
        String str = null;
        str.split(","); //Unchecked exception

        try {
            Files.readAllLines(Paths.get("./folder")); //Checked exception
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
