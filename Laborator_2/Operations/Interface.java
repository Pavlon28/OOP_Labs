package Laborator_2.Operations;


import java.util.Scanner;

public class Interface {

    private final String folderPath;

    public Interface(String folderPath) {
        this.folderPath = folderPath;
    }

    public void run() {
        var detector = new FileDetector(folderPath);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (commit, info, status, exit):");
            String command = scanner.nextLine();
            switch (command) {
                case "commit" -> detector.commit();
                case "info" -> {
                    System.out.println("Enter file name:");
                    String fileName = scanner.nextLine();
                    detector.info(fileName);
                }
                case "status" -> detector.status();
                case "exit" -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid command.");
            }
        }
    }

}
