package com.problemstatements.stringmanipulation.challengeproblem;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class FileReaderAndInputStreamReader {
            public static void main(String[] args) {
                String filePath = "large_100mb.txt";

                // Using FileReader
                long startTimeFileReader = System.currentTimeMillis();
                int wordCountFileReader = countWordsWithFileReader(filePath);
                long endTimeFileReader = System.currentTimeMillis();
                System.out.println("FileReader:");
                System.out.println("Word Count: " + wordCountFileReader);
                System.out.println("Time Taken: " + (endTimeFileReader - startTimeFileReader) + " ms");

                // Using InputStreamReader
                long startTimeInputStreamReader = System.currentTimeMillis();
                int wordCountInputStreamReader = countWordsWithInputStreamReader(filePath);
                long endTimeInputStreamReader = System.currentTimeMillis();
                System.out.println("InputStreamReader:");
                System.out.println("Word Count: " + wordCountInputStreamReader);
                System.out.println("Time Taken: " + (endTimeInputStreamReader - startTimeInputStreamReader) + " ms");
            }

            private static int countWordsWithFileReader(String filePath) {
                int wordCount = 0;
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        wordCount += line.split("\\s+").length;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return wordCount;
            }

            private static int countWordsWithInputStreamReader(String filePath) {
                int wordCount = 0;
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                        new FileInputStream(filePath), StandardCharsets.UTF_8))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        wordCount += line.split("\\s+").length;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return wordCount;
            }
}

