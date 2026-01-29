package com.streamExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Streaming data from files
 * A Method can be used to create a stream of lines from a file.
 * This approach avoids collections and directly streams the file content
* */
public class StreamFromFiles {
    public static void main(String[] args) {
        try {
            Stream<String> lines = Files.lines(Paths.get("C:\\Users\\girwa\\OneDrive\\Desktop\\com.collectionExamples\\src\\com\\streamExamples\\Xyz.txt"));
            lines.filter(line -> line.contains("Java"))
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } {

        }
    }
}
