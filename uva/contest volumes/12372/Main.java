/*
 * Solution for UVA Problem 12372: Packing for the Holiday
 *
 * by Tim Fenney
 *
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
        // Read the number of test cases t
        String line = in.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());

        // Read input for t cases
        for (int aCase = 1; aCase <= t; ++aCase)
        {
            // Read 3 ints and determine the fit
            line = in.readLine();
            st = new StringTokenizer(line);
            boolean good = true;
            for (int i = 0; i < 3; ++i)
            {
                if (Integer.parseInt(st.nextToken()) > 20)
                {
                    good = false;
                }
            }

            // Print the result
            out.println("Case " + aCase + ": " + (good ? "good" : "bad"));
        }
    }
}
