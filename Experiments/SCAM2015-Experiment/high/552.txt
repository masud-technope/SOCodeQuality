package com.stackoverflow.q2292917;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

    public static void main(String... args) throws IOException {
        // Create test file.
        File file = new File("/test.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.println("line 1");
        writer.println("line 2");
        writer.println("line 3");
        writer.println("line 4");
        writer.println("line 5");
        writer.close();

        // Read test file.
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String next, line = reader.readLine();
            for (boolean first = true, last = (line == null); !last; first = false, line = next) {
                last = ((next = reader.readLine()) == null);

                if (first) {
                    System.out.println("first line: " + line);
                } else if (last) {
                    System.out.println("last line: " + line);
                } else {
                    System.out.println("normal line: " + line);
                }
            }
        } finally {
            if (reader != null) try { reader.close(); } catch (IOException logOrIgnore) {}
        }

        // Delete test file.
        file.delete();
    }

}