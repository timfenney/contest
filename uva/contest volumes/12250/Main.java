/*
 * Solution for UVA Problem 12250: Language Detection
 *
 * by Tim Fenney
 */


import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        runSolution(in, out);

        out.close();
    }

    public static void runSolution(BufferedReader in, PrintWriter out) throws IOException
    {
        String line = "";
        int count = 1;

        // Loop forever
        while (true)
        {
            // Read the next word or end of input #
            line = in.readLine();
            if (line.equals("#"))
            {
                return;
            }

            // Solve this line
            solveWord(line, count, out);
            count++;
        }
    }

    public static void solveWord(String word, int count, PrintWriter out)
    {

        // Determine the language
        String language = "UNKNOWN";
        if (word.equals("HELLO"))
        {
            language = "ENGLISH";
        }
        else if (word.equals("HOLA"))
        {
            language = "SPANISH";
        }
        else if (word.equals("HALLO"))
        {
            language = "GERMAN";
        }
        else if (word.equals("BONJOUR"))
        {
            language = "FRENCH";
        }
        else if (word.equals("CIAO"))
        {
            language = "ITALIAN";
        }
        else if (word.equals("ZDRAVSTVUJTE"))
        {
            language = "RUSSIAN";
        }

        // Print the result
        out.println("Case " + count + ": " + language);
    }
}
