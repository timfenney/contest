/*
 * Solution for UVA Problem 1124: Celebrity Jeopardy
 *
 * by Tim Fenney
 * 
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        runSolution(in, out);

        out.close();
    }

    public static void runSolution(BufferedReader in, PrintWriter out) throws IOException
    {
        int check = in.read();
        while (check > -1) {
            out.write((char) check);
            check = in.read();
        }
    }
}
