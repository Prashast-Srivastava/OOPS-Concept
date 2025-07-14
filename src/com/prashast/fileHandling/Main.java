package com.prashast.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String textContent = """
                करारविन्देन पदार्विन्दं, मुखार्विन्दे विनिवेश यन्तम्।
                वटस्य पत्रस्य पुटेशयानं, बालं मुकुन्दं मनसा स्मरामि॥
                """;
        try (FileWriter fw = new FileWriter("file.txt")){
            fw.write("Hare Krishna\n");
            fw.write(textContent);
            System.out.println("data written successfully");
        } catch (FileNotFoundException e){
            System.out.println("couldn't find your file");
        } catch (IOException e) {
            System.out.println("could not write a file");;
        }
    }
}
