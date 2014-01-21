/*
 * Solution for UVA Problem 12289: One - Two - Three
 *
 * by Tim Fenney
 *
 */


import java.io.*;
import java.util.*;

public class Main
{
    static String ONE = "one";
    static String TWO = "two";
    static String THREE = "three";

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        runSolution(in, out);

        out.close();
    }

    public static void runSolution(BufferedReader in, PrintWriter out) throws IOException
    {
        // Set up the word array
        String[] words = { "one", "two", "three" };

        // Read the number of words numWords
        String line = in.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int numWords = Integer.parseInt(st.nextToken());

        for (int i = 0; i < numWords; ++i)
        {
            // Read the word into line
            line = in.readLine();

            // Determine and print the corresponding number
            for (int w = 0; w < words.length; ++w)
            {
                int numWrong = numWrongChars(words[w], line);
                if (numWrong <= 1)
                {
                    out.println(w + 1);
                    break;
                }
            }
        }
    }

    public static int numWrongChars(String a, String b)
    {
        // No possible solution for Strings of differing length
        if (a.length() != b.length())
        {
            return Integer.MAX_VALUE;
        }

        // Count the number of characters that don't match
        int wrong = 0;
        for (int i = 0; i < a.length(); ++i)
        {
            if (a.charAt(i) != b.charAt(i))
            {
                wrong++;
            }
        }

        return wrong;
    }
}
