package Laborator_2.Operations;

import java.util.Scanner;

public class Interface {

    private final String folderPath;

    public Interface(String folderPath) {
        this.folderPath = folderPath;
    }

    public void run() {
        FileDetector detector = new FileDetector(folderPath); // Use explicit data type

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Available commands:");
            System.out.println("commit");
            System.out.println("info");
            System.out.println("status");
            System.out.println("exit");
            System.out.println("___________________");
            System.out.println("Your input:");
            String command = scanner.nextLine();
            switch (command) {
                case "commit":
                    detector.commit();
                    break;
                case "info":
                    System.out.println("Enter file name:");
                    String fileName = scanner.nextLine();
                    detector.info(fileName);
                    break;
                case "status":
                    detector.status();
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}