package com.kunalherkal.learning.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteDemo {
    private static String fileName = "src/main/resources/sample-file2.txt";

    public static void main(String[] args) throws IOException {


        dataOutputStream();



    }

    private static void dataOutputStream() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName));
        dataOutputStream.writeInt(10);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    private static void files() throws IOException {
        Path write = Files.write(Paths.get(fileName), fileName.getBytes());
    }

    private static void fileoutputStream() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write("This is a string".getBytes());
        fileOutputStream.close();
    }

    private static void printWriter() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter, true);
        printWriter.println("Something something");
        printWriter.close();
    }

    private static void bufferedWriter() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Springer nature");
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static void fileWriter() throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write("Kunal R Herkal");
        fileWriter.flush();
        fileWriter.close();
    }
}


