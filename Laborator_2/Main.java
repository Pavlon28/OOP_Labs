package Laborator_2;

import Laborator_2.Operations.Interface;

public class Main {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\pavel\\OneDrive\\Documents\\Idea Projects\\OOP_Labs\\Laborator_2\\Files";
        Interface applicationBehaviour = new Interface(folderPath);
        applicationBehaviour.run();
    }
}