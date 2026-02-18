package dsaRevision2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifyListOfStrings {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();


        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Add a new String");
            System.out.println("2. Add a new String at position X");
            System.out.println("3. Display the List");
            System.out.println("Enter any other number to break.\n");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    appendString(stringList);
                }
                break;
                case 2: {
                    appendStringToIndex(stringList);
                }
                break;
                case 3: {
                    System.out.println(stringList);
                }
                break;
                default:
                    return;
            }
        }

    }

    private static void appendString(List<String> stringList) {
        System.out.print("Enter the string to add: ");
        String str = sc.next();
        stringList.add(str);
    }

    private static void appendStringToIndex(List<String> stringList) {
        System.out.print("Enter the string to add: ");
        String str = sc.next();

        System.out.print("Enter the index to add: ");
        int index = sc.nextInt();

        if (index > stringList.size()) {
            System.out.println("Incorrect index");
            return;
        }

        stringList.add(index, str);
    }

}
