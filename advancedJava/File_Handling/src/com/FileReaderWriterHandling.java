package com;

import java.io.*;

public class FileReaderWriterHandling {

    public static void main(String[] args) {

        File file = new File("IEM");
        System.out.println(file.exists()); // Check whether the directory or file exists or not -> return : boolean
        if (!file.exists()) {
            file.mkdir(); // Create the directory -> return: boolean
            System.out.println(file.exists()); // true
        }

        System.out.println(file.isDirectory()); // return: boolean -> returns true if it is a directory
        System.out.println(file.isFile()); // return: boolean -> returns true if it is a file

        String[] listOfFilesOrFolders = file.list();
        int count = listOfFilesOrFolders.length;
        System.out.println("Total files or folders: " + count);

        for (String fileOrFolderName: listOfFilesOrFolders) {
            System.out.println(fileOrFolderName);
        }

        File demoFile = new File("IEM/demo.txt");
        try {
            demoFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File demo1File = new File(file, "demo1.txt"); // takes the parent directory and the child file/directory as input
        try {
            demo1File.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fileWriter = new FileWriter(demoFile);
            fileWriter.write(97); // takes the ASCII value (int) as input to give the character output
            fileWriter.write("My Name is Dinga");
            char[] c = {'a', 'b', 'c'};
            fileWriter.write(c);
            fileWriter.flush(); // pushes all the contents to the file
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (
//                FileReader fileReader = new FileReader(demoFile); // reads the file character by character
                FileReader fileReader = new FileReader("IEM/demo.txt"); // reads the file character by character
        ) {
            /* read() method is used to read the data char by char and return the ASCII value (int) of the character
            * -> If the character doesn't exist then -1 is returned.
            */
//            int i = fileReader.read();
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
