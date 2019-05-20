package io.github.ensozos.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryReader {
    private String rootPath;
    private String testDirecotryName;
    private String fileExtension;
    private List<String> filePaths;

    /**
     * Construct a direcotry reader object with the given root path and file extension.
     *
     * @param rootPath      the root path (i.e source your source folder).
     * @param fileExtension the file extension of the files you want to read.
     */
    public DirectoryReader(String rootPath, String fileExtension) {
        this.rootPath = rootPath;
        this.fileExtension = fileExtension;
        this.filePaths = new ArrayList<>();
        this.testDirecotryName = "test";

    }

    /**
     * Get the name of the test directory of the source folder.
     *
     * @return the name of the test directory
     */
    public String getTestDirecotryName() {
        return testDirecotryName;
    }

    /**
     * Set the name of the test directory of your source folder. The program
     * is going to skip everything inside this folder.
     *
     * @param testDirecotryName the name of the test directory.
     */
    public void setTestDirecotryName(String testDirecotryName) {
        this.testDirecotryName = testDirecotryName;
    }

    /**
     * Traverse through folders and store all paths of files with the proper extension.
     * Note: The method exclude test directory inside rootFolder.
     *
     * @return the list with all paths of files of source folder.
     */
    public List<String> traverseFromRootDir() {
        File rootDir = new File(rootPath);
        if (!rootDir.exists() || !rootDir.isDirectory()) return null;

        File[] currentDir = rootDir.listFiles((dir, name) -> {
            boolean result;

            if (name.equalsIgnoreCase(testDirecotryName)) {
                result = false;
            } else {
                result = true;
            }

            return result;
        });

        recursiveVisit(currentDir, 0);

        return filePaths;
    }

    private void recursiveVisit(File[] currentDir, int index) {
        if (index == currentDir.length) return;

        File currentFile = currentDir[index];
        if (currentFile.isFile() && getExtension(currentFile.getName()).equals(fileExtension)) {
            this.filePaths.add(currentFile.getPath());
        } else if (currentFile.isDirectory()) {
            recursiveVisit(currentFile.listFiles(), 0);
        }

        recursiveVisit(currentDir, ++index);
    }

    /**
     * Get extension of the given file.
     *
     * @param filename the filename with extension (i.e example.java)
     * @return the extension of file
     */
    private String getExtension(String filename) {
        int lastIndexOf = filename.lastIndexOf('.');
        if (lastIndexOf < 0) return ""; //no extension found

        return filename.substring(lastIndexOf + 1);
    }

}
