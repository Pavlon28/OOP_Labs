package Laborator_2.Operations;

import java.io.File;

abstract public class Detector {

    protected final String folderPath;

    public Detector(String folderPath) {
        this.folderPath = folderPath;
    }

    protected File[] getListOfFiles() {
        var folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("It's not a valid directory: " + folderPath);
            return null;
        }

        var listOfFiles = folder.listFiles();

        if (listOfFiles == null) {
            System.out.println("Unable to list files from the directory: " + folderPath);
            return null;
        }

        return listOfFiles;
    }

    public abstract void scanDirectory();
}
