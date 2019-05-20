import io.github.ensozos.util.DirectoryReader;

import java.util.List;

public class CILauncher {

    /**
     * Main method of the program.
     *
     * @param args Expected command-line arguments; first String
     *             should be source file path and second String should be the
     *             name of the language.
     */
    public static void main(String[] args) {
        if (args.length > 2) {
            System.out.println("\nNo src folder and language provided.\n    ");
            System.out.println("\tUsage: geneci <srcFolderPath> <language>");
        } else {
            String inputDirectory = "C:\\Users\\zosimadis\\IdeaProjects\\matrix-profile\\src";
            String language = "java";

            DirectoryReader directoryReader = new DirectoryReader(inputDirectory, language);
            List<String> files = directoryReader.traverseFromRootDir();
            if (files == null || files.size() <= 0) {
                System.out.println("Error reading from source files");
                System.exit(0);
            }

            ClassInfoGenerator cg = new ClassInfoGenerator("Java");
            String jsonResult = cg.generateClassInfoFromFiles(files);

            System.out.println(jsonResult);
        }

    }
}
