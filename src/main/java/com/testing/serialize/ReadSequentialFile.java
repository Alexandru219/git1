package com.testing.serialize;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {
    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("clients2.ser")));

        } catch (
                IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    public static void readRecords()
    {
        System.out.printf("%-10s%-12s%-12s%10s%n","Account","First Name", "Last Name", "Balance");
        try {
            while (true) {
                Account record = (Account) input.readObject();

                System.out.printf("%-10d%-12s%-12s%10.2f%n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance());
            }
        }
        catch (EOFException endOfFileException){
                System.out.printf("%nNo more records%n");
            }
        catch(ClassNotFoundException classNotFoundException)
        {
            System.err.println("Error");
        }
        catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }

    public static void closeFile() {
        try {
            if (input != null)
                input.close();
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
}
