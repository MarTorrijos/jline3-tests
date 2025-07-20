package org.example;

import org.jline.reader.*;
import org.jline.terminal.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a terminal
            Terminal terminal = TerminalBuilder.builder()
                    .system(true)
                    .build();

            // Create line reader
            LineReader reader = LineReaderBuilder.builder()
                    .terminal(terminal)
                    .build();

            // Prompt and read input
            String line = reader.readLine("JLine > ");

            // Print the result
            System.out.println("You entered: " + line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}