package com.cbfacademy;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileManager {
    // The readFile method reads all lines from the specified file using
    // Files.readAllLines.
    public List<String> readFile(String filename) throws IOException {
        Path filePath = Paths.get(filename);
        return Files.readAllLines(filePath);
    }

    public void copy(String inputFile, String outputFile) throws IOException {
        // The copy method copies the contents of the input file to the output file
        // using Files.copy.
        Path inputPath = Paths.get(inputFile);
        Path outputPath = Paths.get(outputFile);
        Files.copy(inputPath, outputPath, StandardCopyOption.REPLACE_EXISTING);
    }

    public void reverseLines(String inputFile, String outputFile) throws IOException {
        List<String> lines = readFile(inputFile);
        Collections.reverse(lines);

        Path outputPath = Paths.get(outputFile);
        Files.write(outputPath, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}