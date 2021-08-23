package com.jpmc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//java.lang core package
//java.util
//java.net
//java.io (or) java.nio
//java.time
public class FileOps {
    public static void main(String[] args) throws IOException {
        //Files, Paths
//        String data = "Today is monday";
//        Files.write(Paths.get("./hello.txt"), data.getBytes());
//        System.out.println("Done");

        List<String> lines = Files.readAllLines(Paths.get("./hello.txt"));
        System.out.println(lines);
    }
}
