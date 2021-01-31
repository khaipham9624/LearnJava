package basic.LearnJava.chap18;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.*;
public class Test {
    public static void main(String[] args) throws IOException {
//        String dirString = "c:/murach/java/files";
//        Path dirPath = Paths.get(dirString);
//        if (Files.notExists(dirPath)) {
//            Files.createDirectories(dirPath);
//        }
//
//        String fileString = "products.txt";
//        Path filePath = Paths.get(dirString, fileString);
//        if (Files.notExists(filePath)) {
//            Files.createFile(filePath);
//        }
//
//        System.out.println("File name: " + filePath.getFileName());
//        System.out.println("Absolute: " + filePath.toAbsolutePath());
//        System.out.println("Is writable: " + Files.isWritable(filePath));
//
//        if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
//            System.out.println("Directory: " + dirPath.toAbsolutePath());
//            System.out.println("Files: ");
//            DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
//            for (Path p : dirStream) {
//                if (Files.isRegularFile(p)) {
//                    System.out.println("  " + p.getFileName());
//                }
//            }
//        }
        Path productPath = Paths.get("products.txt");
        File productFile = productPath.toFile();

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(productFile)))) {
            writer.println("Java\tMurach's beginning Java\t49.50");

        } catch (IOException e) {
            System.out.println(e);

        }

        try (BufferedReader reader = new BufferedReader(new FileReader(productFile))) {
            String line = reader.readLine();
            System.out.println(line);

        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
