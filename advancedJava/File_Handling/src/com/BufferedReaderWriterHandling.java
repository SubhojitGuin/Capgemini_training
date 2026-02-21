package com;

import java.io.*;
import java.util.Scanner;

public class BufferedReaderWriterHandling {

    public static void main(String[] args) {
        try (
            FileWriter fileWriter = new FileWriter("IEM/demo.txt"); // this will overwrite the data in the file if it exists, otherwise it will create the file
//            FileWriter fileWriter = new FileWriter("IEM/demo.txt", true); // this sets the file to append the new data
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            bufferedWriter.write(97);
            bufferedWriter.newLine();
            bufferedWriter.write("My name is Dinga");
            bufferedWriter.newLine();
            char[] c = {'a', 'b', 'c'};
            bufferedWriter.write(c);

            bufferedWriter.flush();
//            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        try (
//            FileInputStream fileInputStream = new FileInputStream("IEM/demo.txt");
//            Scanner sc = new Scanner(fileInputStream);
//        ) {
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (
            FileReader fileReader = new FileReader("IEM/demo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) { // returns the every line in the form of String
                System.out.println(line);
            }
//            int ch;
//            while ((ch = bufferedReader.read()) != -1) {
//                System.out.print((char)ch);
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
