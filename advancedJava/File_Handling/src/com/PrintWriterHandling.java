package com;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterHandling {

    public static void main(String[] args) {
        try {
//            PrintWriter printWriter = new PrintWriter("IEM/demo.txt");

            // to append
            FileWriter fileWriter = new FileWriter("IEM/demo.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(47);
            printWriter.println("Hi");
            printWriter.println('F');
            printWriter.println(true);
            printWriter.println(99.9);
            printWriter.println(new CustomClass(5, "Subho")); // prints the Object.toString()

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

class CustomClass {
    int value;
    String name;

    public CustomClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
