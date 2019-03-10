package com.kunalherkal.learning.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReadDemo {
    private static String fileName = "src/main/resources/sample-file1.txt";

    public static void main(String[] args) throws IOException {

        bufferedReader();

    }

    private static void bufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void fileInputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);

        int i;
        while((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }

        fileInputStream.close();
    }

    private static void fileReader(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);

        int i;
        while((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }

        fileReader.close();
    }

    private static void files(String fileName) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(fileName));
        strings.forEach(System.out::println);
    }
}
