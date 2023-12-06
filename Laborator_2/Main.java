package Laborator_2;

import Laborator_2.Operations.Command;
import Laborator_2.Operations.ChangingOperations;
import Laborator_2.Operations.Menu;

public class Main {
    public static void main(String[] args) {
        //Title
        System.out.println("\nLaboratory Work #2\n");

        //Print menu
        Menu.printMenu();

        //Start Thread
        Thread thread = new Thread(new ChangingOperations());
        thread.start();

        //Read & Execute commands
        Command command = new Command();
        command.inputCommand();
    }
}